package J04005;

public class ThiSinh {
    private String name, dob;
    private double d1, d2, d3;

    public ThiSinh(String name, String dob, double d1, double d2, double d3) {
        this.name = name;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getTotalScore() {
        return d1 + d2 + d3;
    }

    @Override
    public String toString() {
        return name + " " + dob + " " + String.format("%.1f", getTotalScore());
    }
}
