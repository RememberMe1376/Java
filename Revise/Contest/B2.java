package Contest;

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int sum = 0;
            ArrayList<Character> x = new ArrayList<>();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    x.add(c);
                } else {
                    sum += Character.getNumericValue(c);
                }
            }
            Collections.sort(x);
            for (char c : x) {
                System.out.print(c);
            }
            System.out.println(sum);
        }
    }
}
