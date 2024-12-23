package J07038;

public class DoanhNghiep {
    private String id, ten;
    private int sl;

    public DoanhNghiep(String id, String ten, int sl) {
        this.id = id;
        this.ten = ten;
        this.sl = sl;
    }

    public int getSl() {
        return sl;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }
}
