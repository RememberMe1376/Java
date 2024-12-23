package Contest;

import java.io.*;
import java.util.Scanner;

public class B16 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                long x = Long.parseLong(s);
                if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
                    res += x;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println(res);
        sc.close();
    }
}
