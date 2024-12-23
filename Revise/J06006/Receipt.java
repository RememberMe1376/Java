package J06006;

public class Receipt implements Comparable<Receipt> {
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

    public int getIncome() {
        return amount * (item.getSale() - item.getPurchase());
    }

    @Override
    public int compareTo(Receipt o) {
        return Integer.compare(o.getIncome(), getIncome());
    }

    @Override
    public String toString() {
        return id + " " + customer.getName() + " " + customer.getAddress() + " " + item.getName() + " " + amount + " "
                + amount * item.getSale() + " " + getIncome();
    }
}
