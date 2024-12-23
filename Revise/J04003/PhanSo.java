package J04003;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    @Override
    public String toString() {
        long k = gcd(tu, mau);
        return tu / k + "/" + mau / k;
    }
}
