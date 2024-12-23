package J05046;

public class MatHang {
    private String name;
    private int id, sl, gia;

    public MatHang(String name, int sl, int gia) {
        this.name = name;
        this.sl = sl;
        this.gia = gia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        if (sl > 10) {
            return gia * sl * 5 / 100;
        }
        if (sl >= 8) {
            return gia * sl * 2 / 100;
        }
        if (sl >= 5) {
            return gia * sl / 100;
        }
        return 0;
    }

    public String getNameId() {
        String[] s = name.split("\\s+");
        return (s[0].substring(0, 1) + s[1].substring(0, 1)).toUpperCase();
    }

    public String getId() {
        return getNameId() + String.format("%02d", id);
    }

    public int getSale() {
        return sl * gia - getDiscount();
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + getDiscount() + " " + getSale();
    }
}
