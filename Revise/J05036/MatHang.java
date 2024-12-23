package J05036;

public class MatHang {
    private static int ID = 0;
    private String id, ten, dvi;
    private int mua, sl;

    public MatHang(String ten, String dvi, int mua, int sl) {
        this.id = String.format("MH%02d", ++ID);
        this.ten = ten;
        this.dvi = dvi;
        this.mua = mua;
        this.sl = sl;
    }

    public int phiVanChuyen() {
        return (int) Math.round((mua * sl) * 0.05);
    }

    public int thanhTien() {
        return mua * sl + phiVanChuyen();
    }

    public int giaBan() {
        return (int) Math.round(1.02 * thanhTien());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + dvi + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}
