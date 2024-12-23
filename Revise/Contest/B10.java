package Contest;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int x = 0, d = 0, m = 0, xd = 0, dx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                x++;
            }
            if (s.charAt(i) == 'D') {
                d++;
            }
        }
        for (int i = 0; i < x; i++) {
            if (s.charAt(i) == 'D') {
                dx++;
            }
            if (s.charAt(i) != 'X') {
                m++;
            }
        }
        for (int i = s.length() - d; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                xd++;
            }
            if (s.charAt(i) != 'D') {
                m++;
            }
        }
        System.out.println(m - Math.min(dx, xd));
    }
}
