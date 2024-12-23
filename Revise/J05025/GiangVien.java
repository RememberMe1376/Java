package J05025;

public class GiangVien implements Comparable<GiangVien> {
    private static int ID = 0;
    private String id, name, subject;

    public GiangVien(String name, String subject) {
        this.id = String.format("GV%02d", ++ID);
        this.name = name;
        this.subject = subject;
    }

    public String getLastName() {
        String[] s = name.split("\\s+");
        return s[s.length - 1].toLowerCase();
    }

    public String getSubject() {
        return subject;
    }

    public String getSj() {
        String[] s = subject.split("\\s+");
        String sj = "";
        for (String i : s) {
            sj += i.substring(0, 1).toUpperCase();
        }
        return sj;
    }

    @Override
    public int compareTo(GiangVien o) {
        return getLastName().compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getSj();
    }
}
