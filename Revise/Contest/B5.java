package Contest;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] x = s.split(" ");
            for (int i = x.length - 1; i >= 0; i--) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
    }
}
