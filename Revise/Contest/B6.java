package Contest;

import java.util.*;

public class B6 {

    public static String chuanhoa(String s, int n) {
        String[] words = s.split("\\s+");
        int l = words.length;
        for (int i = 0; i < l; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        String res = "";
        if (n == 1) {
            res += words[l - 1] + " ";
            for (int i = 0; i < l - 1; i++) {
                res += words[i] + " ";
            }
        } else if (n == 2) {
            for (int i = 1; i < l; i++) {
                res += words[i] + " ";
            }
            res += words[0];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(chuanhoa(s, n));
        }
    }
}
