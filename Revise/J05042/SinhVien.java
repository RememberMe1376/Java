package J05042;

public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int ac, sub;

    public SinhVien(String name, String[] s) {
        this.name = name;
        this.ac = Integer.parseInt(s[0]);
        this.sub = Integer.parseInt(s[1]);
    }

    public int getAc() {
        return ac;
    }

    public String getName() {
        return name;
    }

    public int getSub() {
        return sub;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (ac == o.getAc()) {
            if (sub == o.getSub()) {
                return name.compareTo(o.getName());
            }
            return Integer.compare(sub, o.getSub());
        }
        return Integer.compare(o.getAc(), ac);
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + sub;
    }
}
