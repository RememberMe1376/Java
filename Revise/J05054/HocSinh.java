package J05054;

public class HocSinh implements Comparable<HocSinh> {
    private String id, ten, xeploai;
    private double diem;
    private int rank;

    public HocSinh(String id, String ten, double diem) {
        this.id = id;
        this.ten = ten;
        this.diem = diem;
    }

    public String getId() {
        return id;
    }

    public double getDiem() {
        return diem;
    }

    public int getRank() {
        return rank;
    }

    public void setXeploai() {
        if (diem < 5) {
            this.xeploai = "Yeu";
        } else if (diem < 7) {
            this.xeploai = "Trung Binh";
        } else if (diem < 9) {
            this.xeploai = "Kha";
        } else {
            this.xeploai = "Gioi";
        }
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(HocSinh o) {
        return Double.compare(o.getDiem(), getDiem());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + diem + " " + xeploai + " " + rank;
    }
}
