package J04007;

public class NhanVien {
    private String id = "00001", ten, gt, dob, dc, tax, hd;

    public NhanVien(String ten, String gt, String dob, String dc, String tax, String hd) {
        this.ten = ten;
        this.gt = gt;
        this.dob = dob;
        this.dc = dc;
        this.tax = tax;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gt + " " + dob + " " + dc + " " + tax + " " + hd;
    }
}
