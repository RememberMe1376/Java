package J06001;

public class SanPham {
    private String id, ten;
    private long gia1, gia2;

    public SanPham(String id, String ten, long gia1, long gia2) {
        this.id = id;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }
}
