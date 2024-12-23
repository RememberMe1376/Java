package J05050;

public class Bill {
    private String id, sd;
    private int x, y;

    public Bill(int i, String sd, int x, int y) {
        this.id = String.format("KH%02d", i);
        this.sd = sd;
        this.x = x;
        this.y = y;
    }

    public long getFactor() {
        switch (sd) {
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            default:
                return 2;
        }
    }

    public long toMoney() {
        return (y - x) * getFactor() * 550;
    }

    public long getExtra() {
        int dif = y - x;
        if (dif < 50) {
            return 0;
        }
        if (dif <= 100) {
            return (long) Math.ceil(toMoney() * 0.35);
        }
        return toMoney();
    }

    public long getTotal() {
        return toMoney() + getExtra();
    }

    @Override
    public String toString() {
        return id + " " + getFactor() + " " + toMoney() + " " + getExtra() + " " + getTotal();
    }
}