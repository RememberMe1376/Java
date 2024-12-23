package Contest;

import java.util.*;

public class B11 {
    public static boolean check(String x) {
        if (x.length() != 8 || x.charAt(2) != ':' || x.charAt(5) != ':') {
            return false;
        }
        try {
            int h = Integer.parseInt(x.substring(0, 2));
            int m = Integer.parseInt(x.substring(3, 5));
            int s = Integer.parseInt(x.substring(6, 8));
            return h < 24 && m < 60 && s < 60;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> se = new LinkedHashSet();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] x = s.split("\\s|\\.|\\,");
            for (String i : x) {
                if (check(i)) {
                    se.add(i);
                }
            }
        }
        List<String> res = new ArrayList<>(se);
        Collections.sort(res);
        for (String i : res) {
            System.out.println(i);
        }
    }
}
