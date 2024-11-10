package ThucHanh.TH3.C;

public class Student implements Comparable<Student> {
    private String id, ten, lop, email, phone;

    public Student(String id, String ten, String lop, String email, String phone) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.phone = "0" + phone;
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
            return id.compareTo(o.getId());
        }
        return lop.compareTo(o.getLop());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + email + " " + phone;
    }
}
