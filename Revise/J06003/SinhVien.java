package J06003;

public class SinhVien {
    private String msv, ten, sdt;
    private int stt;

    public SinhVien(String msv, String ten, String sdt, int stt) {
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + sdt;
    }

    public int getStt() {
        return stt;
    }
}
