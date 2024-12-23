package J05034;

public class Student implements Comparable<Student> {
    private int stt;
    private String msv, ten, lop, email, dn;

    public Student(int stt, String msv, String ten, String lop, String email, String dn) {
        this.stt = stt;
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getTen() {
        return ten;
    }

    public String getDn() {
        return dn;
    }

    @Override
    public int compareTo(Student o) {
        return ten.compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return stt + " " + msv + " " + ten + " " + lop + " " + email + " " + dn;
    }
}
