package J05018;

public class HocSinh implements Comparable<HocSinh> {
    private static int ID = 0;
    private String id, ten;
    private double res;

    public HocSinh(String ten, String[] score) {
        this.id = String.format("HS%02d", ++ID);
        this.ten = ten;
        this.res = getAverage(score);
    }

    public double getAverage(String[] score) {
        double res = Double.parseDouble(score[0]) * 2 + Double.parseDouble(score[1]) * 2;
        for (int i = 2; i < score.length; i++) {
            res += Double.parseDouble(score[i]);
        }
        return res / 12;
    }

    public String getRank() {
        if (res >= 9) {
            return "XUAT SAC";
        }
        if (res >= 8) {
            return "GIOI";
        }
        if (res >= 7) {
            return "KHA";
        }
        if (res >= 5) {
            return "TB";
        }
        return "YEU";
    }

    public String getId() {
        return id;
    }

    public double getRes() {
        return res;
    }

    @Override
    public int compareTo(HocSinh o) {
        if (res == o.getRes()) {
            return id.compareTo(o.getId());
        }
        return Double.compare(o.getRes(), res);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + String.format("%.1f", Math.round(res * 10.0) / 10.0) + " " + getRank();
    }
}
