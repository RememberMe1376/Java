package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private String msv = "B20DCCN001", ten, lop, dob;
    private double gpa;

    public Student(String ten, String lop, String dob, double gpa) {
        this.ten = ten;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String chuanhoa() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d = sdf.parse(dob);
            return sdf.format(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + chuanhoa() + " " + String.format("%.2f", gpa);
    }
}
