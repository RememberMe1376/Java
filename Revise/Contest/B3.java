package Contest;

import java.util.Scanner;

public class B3 {

    public static boolean prime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long res = 0;
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (prime(n / i)) {
                        res = n / i;
                        break;
                    }
                    if (prime(i)) {
                        res = i;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
