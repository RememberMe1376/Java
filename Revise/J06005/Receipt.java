package J06005;

public class Receipt {
    private String id;
    private Customer customer;
    private Item item;
    private int amount;

    public Receipt(int id, Customer customer, Item item, int amount) {
        this.id = String.format("HD%03d", id);
        this.customer = customer;
        this.item = item;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return id + " " + customer.getName() + " " + customer.getAddress() + " " + item.getName() + " " + item.getUnit()
                + " " + item.getPurchase() + " " + item.getSale() + " " + amount + " " + amount * item.getSale();
    }
}
