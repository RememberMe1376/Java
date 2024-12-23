package J05010;

public class MatHang implements Comparable<MatHang> {
    private static int ID = 0;
    private String id, ten, nhom;
    private Double mua, ban;

    public MatHang(String ten, String nhom, Double mua, Double ban) {
        this.id = String.format("%d", ++ID);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }

    public Double getLoiNhuan() {
        return ban - mua;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.getLoiNhuan(), this.getLoiNhuan());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + nhom + " " + String.format("%.2f", getLoiNhuan());
    }
}
