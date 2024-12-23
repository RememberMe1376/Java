package J05009;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ThiSinh implements Comparable<ThiSinh> {
    private static int ID = 0;
    private String id, ten, dob;
    private double d1, d2, d3;

    public ThiSinh(String ten, String dob, double d1, double d2, double d3) throws ParseException {
        this.id = String.format("%d", ++ID);
        this.ten = ten;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getTongDiem() {
        return d1 + d2 + d3;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + dob + " " + getTongDiem();
    }

}
