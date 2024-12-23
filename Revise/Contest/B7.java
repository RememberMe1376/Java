package Contest;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        String s = a[0];
        int l = s.length();
        boolean flag = true;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            int d = 0;
            for (int j = 0; j < n; j++) {
                String x = a[j];
                int k;
                for (k = 0; k < l; k++) {
                    if (x.equals(s)) {
                        d += k;
                        break;
                    }
                    x = x.substring(1) + x.charAt(0);
                }
                if (k == l) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res = Math.min(res, d);
            }
            s = s.substring(1) + s.charAt(0);
        }
        if (flag) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }
}
