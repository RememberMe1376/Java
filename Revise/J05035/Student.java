package J05035;

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

    public String getMsv() {
        return msv;
    }

    public String getDn() {
        return dn;
    }

    @Override
    public int compareTo(Student o) {
        return msv.compareTo(o.getMsv());
    }

    @Override
    public String toString() {
        return stt + " " + msv + " " + ten + " " + lop + " " + email + " " + dn;
    }
}
