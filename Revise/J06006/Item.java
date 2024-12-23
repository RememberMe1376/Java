package J06006;

public class Item {
    private String id, name, unit;
    private int purchase, sale;

    public Item(int id, String name, String unit, int purchase, int sale) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.purchase = purchase;
        this.sale = sale;
    }

    public String getId() {
        return id;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getPurchase() {
        return purchase;
    }

    public int getSale() {
        return sale;
    }

}
