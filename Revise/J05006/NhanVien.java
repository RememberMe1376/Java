package J05006;

public class NhanVien {
    private static int ID = 0;
    private String id, ten, gt, dob, address, tax, hd;

    public NhanVien(String ten, String gt, String dob, String address, String tax, String hd) {
        this.id = String.format("%05d", ++ID);
        this.ten = ten;
        this.gt = gt;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gt + " " + dob + " " + address + " " + tax + " " + hd;
    }
}
