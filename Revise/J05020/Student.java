package J05020;

public class Student implements Comparable<Student> {
    private String msv, ten, lop, email;

    public Student(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public int compareTo(Student o) {
        if (lop.equals(o.getLop())) {
            return msv.compareTo(o.getMsv());
        }
        return lop.compareTo(o.getLop());
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }
}
