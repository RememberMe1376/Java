package J04013;

public class ThiSinh {
    private String id, ten;
    private double toan, ly, hoa;

    public ThiSinh(String id, String ten, double toan, double ly, double hoa) {
        this.id = id;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String format(double x) {
        int k = (int) (x * 10);
        return k % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    public String ketqua() {
        double res = toan * 2 + ly + hoa;
        double bonus;
        if (id.charAt(2) == '1') {
            bonus = 0.5;
        } else if (id.charAt(2) == '2') {
            bonus = 1;
        } else {
            bonus = 2.5;
        }
        String state = "", ans;
        if (res + bonus >= 24) {
            state = "TRUNG TUYEN";
        } else {
            state = "TRUOT";
        }
        return format(bonus) + " " + format(res) + " " + state;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + ketqua();
    }
}
