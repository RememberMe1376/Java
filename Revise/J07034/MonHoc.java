package J07034;

public class MonHoc implements Comparable<MonHoc> {
    private String id, ten;
    private int tc;

    public MonHoc(String id, String ten, int tc) {
        this.id = id;
        this.ten = ten;
        this.tc = tc;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ten.compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + tc;
    }
}
