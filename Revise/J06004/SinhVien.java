package J06004;

public class SinhVien implements Comparable<SinhVien> {
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
        return msv + " " + ten + " " + sdt + " " + stt + " ";
    }

    public int getStt() {
        return stt;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.getMsv());
    }
}
