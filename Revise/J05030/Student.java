package J05030;

public class Student implements Comparable<Student> {
    private String msv, ten, lop;
    private double d1, d2, d3;

    public Student(String msv, String ten, String lop, double d1, double d2, double d3) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public int compareTo(Student o) {
        return msv.compareTo(o.getMsv());
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + String.format("%.1f %.1f %.1f", d1, d2, d3);
    }
}
