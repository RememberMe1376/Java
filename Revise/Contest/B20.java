package Contest;

import java.util.*;
import java.io.*;

public class B20 {

    public static boolean check(String s) {
        boolean ok = false;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                ok = true;
            }
            if (".,?!;:".indexOf(c) != -1) {
                return false;
            }
        }
        return ok;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> se = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] lst = s.split("\\s+");
            for (String i : lst) {
                if (check(i)) {
                    se.add(i);
                }
            }
        }
        sc.close();
        for (String i : se) {
            System.out.println(i);
        }
    }
}
