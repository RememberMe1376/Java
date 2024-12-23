package J07038;

public class ThucTap implements Comparable<ThucTap> {
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap() {
    }

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }

    public SinhVien getSv() {
        return sv;
    }

    public DoanhNghiep getDn() {
        return dn;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setDn(DoanhNghiep dn) {
        this.dn = dn;
    }

    @Override
    public int compareTo(ThucTap o) {
        return sv.getMsv().compareTo(o.sv.getMsv());
    }

    @Override
    public String toString() {
        return sv.getMsv() + " " + sv.getTen() + " " + sv.getLop();
    }
}
