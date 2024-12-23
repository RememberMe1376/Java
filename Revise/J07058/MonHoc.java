package J07058;

public class MonHoc implements Comparable<MonHoc> {
    private String id, ten, ht;

    public MonHoc(String id, String ten, String ht) {
        this.id = id;
        this.ten = ten;
        this.ht = ht;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(MonHoc o) {
        return id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + ht;
    }
}
