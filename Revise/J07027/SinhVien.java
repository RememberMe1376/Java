package J07027;

public class SinhVien implements Comparable<SinhVien> {
    private String msv, ten, sdt, baitap;
    private int nhom;

    public SinhVien(String msv, String ten, String sdt, int nhom) {
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public int getNhom() {
        return nhom;
    }

    public void setBaitap(String baitap) {
        this.baitap = baitap;
    }

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.getMsv());
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + sdt + " " + nhom + " " + baitap;
    }
}
