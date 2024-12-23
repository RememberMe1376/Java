package Contest.B22;

public class Student implements Comparable<Student> {
    private String ten;
    private int ac, sub;

    public Student(String ten, int ac, int sub) {
        this.ten = ten;
        this.ac = ac;
        this.sub = sub;
    }

    public String getTen() {
        return ten;
    }

    public int getAc() {
        return ac;
    }

    public int getSub() {
        return sub;
    }

    @Override
    public int compareTo(Student o) {
        if (ac == o.getAc()) {
            if (sub == o.getSub()) {
                return ten.compareTo(o.getTen());
            }
            return Integer.compare(sub, o.getSub());
        }
        return Integer.compare(ac, o.getAc());
    }

    @Override
    public String toString() {
        return ten + " " + ac + " " + sub;
    }
}
