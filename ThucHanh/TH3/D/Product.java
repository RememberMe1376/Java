package ThucHanh.TH3.D;

public class Product {
    private String proID, proName;
    private int price, bh;

    public Product(String proID, String proName, int price, int bh) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
        this.bh = bh;
    }

    public String getProID() {
        return proID;
    }

    public int getPrice() {
        return price;
    }

    public int getBh() {
        return bh;
    }

}
