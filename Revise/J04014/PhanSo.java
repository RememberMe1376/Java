package J04014;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public PhanSo rutgon() {
        long k = gcd(tu, mau);
        return new PhanSo(tu / k, mau / k);
    }

    public PhanSo tong(PhanSo o) {
        PhanSo a = new PhanSo(tu * o.getMau() + mau * o.getTu(), mau * o.getMau());
        return a.rutgon();
    }

    public PhanSo tich(PhanSo o) {
        PhanSo a = new PhanSo(tu * o.getTu(), mau * o.getMau());
        return a.rutgon();
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
