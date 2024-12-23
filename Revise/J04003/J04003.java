package J04003;

import java.util.Scanner;

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo p = new PhanSo(a, b);
        System.out.println(p);
    }
}
