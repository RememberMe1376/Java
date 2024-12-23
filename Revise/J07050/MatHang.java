package J07050;

public class MatHang implements Comparable<MatHang> {
    private String id, ten, nhom;
    private double mua, ban;

    public MatHang(int id, String ten, String nhom, double mua, double ban) {
        this.id = String.format("MH%02d", id);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }

    public double getLoiNhuan() {
        return ban - mua;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.getLoiNhuan(), getLoiNhuan());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + nhom + " " + String.format("%.2f", getLoiNhuan());
    }
}
