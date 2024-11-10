package ThucHanh.TH3.B;

import java.text.*;
import java.time.*;
import java.util.*;

public class CongNhan implements Comparable<CongNhan> {
    private String ma, ten;
    int gioLamViec, phutLamViec;

    public CongNhan(String ma, String ten, String gioVao, String gioRa) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date gioVaoDate = sdf.parse(gioVao);
        Date gioRaDate = sdf.parse(gioRa);
        long timeDiff = gioRaDate.getTime() - gioVaoDate.getTime();
        int totalMins = (int) (timeDiff / (1000 * 60));
        totalMins -= 60;
        this.gioLamViec = totalMins / 60;
        this.phutLamViec = totalMins % 60;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public String getMa() {
        return ma;
    }

    public int getPhutLamViec() {
        return phutLamViec;
    }

    public String checkTime() {
        if (gioLamViec >= 8) {
            return "DU";
        } else {
            return "THIEU";
        }
    }

    @Override
    public int compareTo(CongNhan o) {
        int thisTotalMins = this.gioLamViec * 60 + this.phutLamViec;
        int otherTotalMins = o.getGioLamViec() * 60 + o.getPhutLamViec();
        if (thisTotalMins != otherTotalMins) {
            return otherTotalMins - thisTotalMins;
        } else {
            return this.ma.compareTo(o.getMa());
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioLamViec + " gio " + phutLamViec + " phut " + checkTime();
    }
}
