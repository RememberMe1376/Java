package J05052;

public class MatHang {
    private String ten, id;
    private int gia, sl;

    public MatHang(String ten, String id, int gia, int sl) {
        this.ten = ten;
        this.id = id;
        this.gia = gia;
        this.sl = sl;
    }

    public String getStt() {
        return id.substring(1, 4);
    }

    public int getDiscount() {
        if (id.endsWith("1")) {
            return (int) Math.ceil(gia * sl / 2);
        }
        if (id.endsWith("2")) {
            return (int) Math.ceil(gia * sl / 100 * 30);
        }
        return 0;
    }

    public int total() {
        return gia * sl - getDiscount();
    }

    @Override
    public String toString() {
        return ten + " " + id + " " + getStt() + " " + getDiscount() + " " + total();
    }
}
