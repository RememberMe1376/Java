package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SinhVien {
    private static int ID = 0;
    private String msv, ten, lop, dob;
    private double gpa;

    public SinhVien(String ten, String lop, String dob, double gpa) {
        this.msv = String.format("B20DCCN%03d", ++ID);
        this.ten = ten;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String chuanHoaDob() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d = sdf.parse(dob);
            return sdf.format(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String chuanHoaTen() {
        String[] s = ten.toLowerCase().trim().split("\\s+");
        for (int i = 0; i < s.length; i++)
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        return String.join(" ", s);
    }

    @Override
    public String toString() {
        return msv + " " + chuanHoaTen() + " " + lop + " " + chuanHoaDob() + " "
                + String.format("%.2f", gpa);
    }
}
