package J06002;

public class HoaDon implements Comparable<HoaDon> {
    private String id;
    private Long sl;
    private SanPham sp;

    public HoaDon(String id, int stt, Long sl, SanPham sp) {
        this.id = String.format("%s-%03d", id, stt);
        this.sl = sl;
        this.sp = sp;
    }

    public int getDiscountPercent() {
        if (sl >= 150) {
            return 50;
        }
        if (sl >= 100) {
            return 30;
        }
        if (sl >= 50) {
            return 15;
        }
        return 0;
    }

    public long getPrice() {
        return sl * (id.charAt(2) == '1' ? sp.getGia1() : sp.getGia2());
    }

    public long getDiscount() {
        return (long) getPrice() * getDiscountPercent() / 100;
    }

    public long total() {
        return getPrice() - getDiscount();
    }

    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.total(), total());
    }

    @Override
    public String toString() {
        return id + " " + sp.getTen() + " " + getDiscount() + " " + total();
    }

}
