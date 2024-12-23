package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id, tt;

    public LoaiPhong(String tt) {
        this.id = tt.trim().split("\\s+")[1];
        this.tt = tt;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return tt;
    }
}
