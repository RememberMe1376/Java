import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TrietGiaTestAndSet extends Thread {
    private final int id;
    private final Lock khoaChung;
    private final Condition[] dieuKien;
    private static final int N = 5;
    private static TrangThai[] trangThai = new TrangThai[N];
    private static AtomicBoolean khoaAn = new AtomicBoolean(false);

    enum TrangThai {
        SUY_NGHI, DOI, AN
    }

    public TrietGiaTestAndSet(int id, Lock khoaChung, Condition[] dieuKien) {
        this.id = id;
        this.khoaChung = khoaChung;
        this.dieuKien = dieuKien;
        trangThai[id] = TrangThai.SUY_NGHI;
    }

    // Kiểm tra và cấp quyền ăn cho triết gia
    private void kiemTraAn(int trietGia) {
        if (trangThai[trietGia] == TrangThai.DOI &&
                trangThai[(trietGia + N - 1) % N] != TrangThai.AN &&
                trangThai[(trietGia + 1) % N] != TrangThai.AN &&
                !khoaAn.getAndSet(true)) { // Test-and-Set
            trangThai[trietGia] = TrangThai.AN;
            dieuKien[trietGia].signal();
        }
    }

    // Triết gia lấy đũa để ăn
    private void layDua() {
        khoaChung.lock();
        try {
            trangThai[id] = TrangThai.DOI;
            kiemTraAn(id);
            while (trangThai[id] != TrangThai.AN)
                dieuKien[id].await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            khoaChung.unlock();
        }
    }

    // Triết gia trả đũa sau khi ăn
    private void traDua() {
        khoaChung.lock();
        try {
            trangThai[id] = TrangThai.SUY_NGHI;
            khoaAn.set(false); // Giải phóng khóa
            kiemTraAn((id + N - 1) % N);
            kiemTraAn((id + 1) % N);
        } finally {
            khoaChung.unlock();
        }
    }

    // Hành vi của triết gia
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Triết gia " + id + " đang suy nghĩ.");
                Thread.sleep((int) (Math.random() * 1000)); // Suy nghĩ
                layDua();
                System.out.println("Triết gia " + id + " đang ăn.");
                Thread.sleep((int) (Math.random() * 1000)); // Ăn
                traDua();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class tg {
    public static void main(String[] args) {
        int soTrietGia = 5;
        Lock khoaChung = new ReentrantLock();
        Condition[] dieuKien = new Condition[soTrietGia];

        for (int i = 0; i < soTrietGia; i++) {
            dieuKien[i] = khoaChung.newCondition();
        }

        TrietGiaTestAndSet[] cacTrietGia = new TrietGiaTestAndSet[soTrietGia];
        for (int i = 0; i < soTrietGia; i++) {
            cacTrietGia[i] = new TrietGiaTestAndSet(i, khoaChung, dieuKien);
            cacTrietGia[i].start();
        }
    }
}
