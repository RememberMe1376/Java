package Contest;

import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            long tich = 1, tong = 0;
            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) != '0') {
                    tich *= s.charAt(i) - '0';
                }
            }
            for (int i = 1; i < s.length(); i += 2) {
                tong += s.charAt(i) - '0';
            }
            System.out.println(tich + " " + tong);
        }

    }
}
