package Contest.B21;

public class Student implements Comparable<Student> {
    private String id, ten, lop, email, sdt;

    public Student(String id, String ten, String lop, String email, String sdt) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public int compareTo(Student o) {
        if (lop.equals(o.getLop())) {
            return id.compareTo(o.id);
        }
        return lop.compareTo(o.getLop());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
