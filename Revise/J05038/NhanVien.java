package J05038;

public class NhanVien {
    private static int ID = 0;
    private String id, ten, cv;
    private int daySalary, day;

    public NhanVien(String ten, int daySalary, int day, String cv) {
        this.id = String.format("NV%02d", ++ID);
        this.ten = ten;
        this.cv = cv;
        this.daySalary = daySalary;
        this.day = day;
    }

    public int getMonthSalary() {
        return daySalary * day;
    }

    public int getBonus() {
        if (day >= 25) {
            return getMonthSalary() / 5;
        }
        if (day >= 22) {
            return getMonthSalary() / 10;
        }
        return 0;
    }

    public int getPhuCap() {
        if (cv.equals("GD")) {
            return 250000;
        }
        if (cv.equals("PGD")) {
            return 200000;
        }
        if (cv.equals("TP")) {
            return 180000;
        }
        return 150000;
    }

    public int total() {
        return getMonthSalary() + getBonus() + getPhuCap();
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + getMonthSalary() + " " + getBonus() + " " + getPhuCap() + " " + total();
    }
}
