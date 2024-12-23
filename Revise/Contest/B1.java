package Contest;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            String[] words = x.split(" ");
            for (String i : words) {
                if (i.length() > s.length()) {
                    s = i;
                }
            }
        }
        System.out.println(s + " - " + s.length());
    }
}
