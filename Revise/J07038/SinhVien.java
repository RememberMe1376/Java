package J07038;

public class SinhVien {
    private String msv, ten, lop, email, dn;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = formatTen(ten);
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String getTen() {
        return ten;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getMsv() {
        return msv;
    }

    public String formatTen(String ten) {
        StringBuilder sbd = new StringBuilder();
        String[] s = ten.split("\\s+");
        for (int i = 0; i < s.length; i++) {
            sbd.append(s[i].substring(0, 1).toUpperCase()).append(s[i].substring(1).toLowerCase()).append(" ");
        }
        return sbd.toString().trim();
    }
}
