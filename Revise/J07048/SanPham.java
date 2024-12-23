package J07048;

public class SanPham implements Comparable<SanPham> {
    private String id, ten;
    private int gia, bh;

    public SanPham(String id, String ten, int gia, int bh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    public String getId() {
        return id;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public int compareTo(SanPham o) {
        if (gia == o.getGia()) {
            return id.compareTo(o.getId());
        }
        return Integer.compare(o.getGia(), gia);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gia + " " + bh;
    }
}
