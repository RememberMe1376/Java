package J05029;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id, name;
    private int slot;

    public DoanhNghiep(String id, String name, int slot) {
        this.id = id;
        this.name = name;
        this.slot = slot;
    }

    public String getId() {
        return id;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if (slot == o.getSlot()) {
            return id.compareTo(o.getId());
        }
        return Integer.compare(o.getSlot(), slot);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + slot;
    }
}
