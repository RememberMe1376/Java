package J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NhanVien implements Comparable<NhanVien> {
    private static int ID = 0;
    private String id, ten, gt, address, tax, hd;
    private Date ns;

    public NhanVien(String ten, String gt, String ns, String address, String tax, String hd) throws ParseException {
        this.id = String.format("%05d", ++ID);
        this.ten = ten;
        this.gt = gt;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.address = address;
        this.tax = tax;
        this.hd = hd;
    }

    public Date getNs() {
        return ns;
    }

    @Override
    public int compareTo(NhanVien o) {
        return ns.compareTo(o.getNs());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gt + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + address + " "
                + tax + " " + hd + " ";
    }
}
