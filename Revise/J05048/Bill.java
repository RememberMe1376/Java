package J05048;

public class Bill {
    private String id;
    private int sl;

    public Bill(String id, int sl) {
        this.id = id;
        this.sl = sl;
    }

    public int getXuat() {
        if (id.startsWith("A")) {
            return (int) Math.round(sl * 0.6);
        }
        return (int) Math.round(sl * 0.7);
    }

    public int getDonGia() {
        if (id.endsWith("Y")) {
            return 110000;
        }
        return 135000;
    }

    public int getTien() {
        return getXuat() * getDonGia();
    }

    public int getThue() {
        if (id.startsWith("A")) {
            if (id.endsWith("Y")) {
                return (int) (getTien() * 0.08);
            }
            return (int) (getTien() * 0.11);
        }
        if (id.endsWith("Y")) {
            return (int) (getTien() * 0.17);
        }
        return (int) (getTien() * 0.22);
    }

    @Override
    public String toString() {
        return id + " " + sl + " " + getXuat() + " " + getDonGia() + " " + getTien() + " " + getThue();
    }
}
