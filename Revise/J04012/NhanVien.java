package J04012;

public class NhanVien {
    private static int ID = 0;
    private String id, ten, chuc;
    private int luong, ngay;

    public NhanVien(String ten, String chuc, int luong, int ngay) {
        this.id = String.format("NV%02d", ++ID);
        this.ten = ten;
        this.chuc = chuc;
        this.luong = luong;
        this.ngay = ngay;
    }

    public int bonus() {
        if (ngay >= 25) {
            return luong * ngay / 5;
        } else if (ngay >= 22 && ngay < 25) {
            return luong * ngay / 10;
        }
        return 0;
    }

    public int phucap() {
        if (chuc.equals("GD")) {
            return 250000;
        } else if (chuc.equals("PGD")) {
            return 200000;
        } else if (chuc.equals("TP")) {
            return 180000;
        }
        return 150000;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + luong * ngay + " " + bonus() + " " + phucap() + " "
                + (luong * ngay + bonus() + phucap());
    }
}
