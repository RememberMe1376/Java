package J05044;

public class NhanVien {
    private String id, ten, cv;
    private int baseSalary, day;
    private static int ID = 0;

    public NhanVien(String ten, String cv, int baseSalary, int day) {
        this.id = String.format("NV%02d", ++ID);
        this.ten = ten;
        this.cv = cv;
        this.baseSalary = baseSalary;
        this.day = day;
    }

    public String getCv() {
        return cv;
    }

    public int getSalary() {
        return baseSalary * day;
    }

    public int getBonus() {
        if (cv.equals("GD")) {
            return 500;
        }
        if (cv.equals("PGD")) {
            return 400;
        }
        if (cv.equals("TP")) {
            return 300;
        }
        if (cv.equals("KT")) {
            return 250;
        }
        return 100;
    }

    public int getAdvance() {
        double k = (getSalary() + getBonus()) * 2 / 3.0;
        if (k < 25000) {
            return (int) Math.round(k / 1000) * 1000;
        }
        return 25000;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + getBonus() + " " + getSalary() + " " + getAdvance() + " "
                + (getSalary() + getBonus() - getAdvance());
    }
}
