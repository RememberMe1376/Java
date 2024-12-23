package J04014;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            PhanSo p1 = new PhanSo(a, b);
            PhanSo p2 = new PhanSo(c, d);
            PhanSo p3 = p1.tong(p2).tich(p1.tong(p2));
            PhanSo p4 = p1.tich(p2).tich(p3);
            System.out.print(p3 + " ");
            System.out.println(p4);
        }
    }
}
