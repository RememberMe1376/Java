package J04001;

import java.util.Scanner;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x, y);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
