package J04008;

import java.util.Scanner;

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Point[] lst = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                lst[i] = new Point(x, y);
            }
            double d1 = lst[0].distance(lst[1]);
            double d2 = lst[0].distance(lst[2]);
            double d3 = lst[1].distance(lst[2]);
            if (d1 + d2 > d3 && d1 + d3 > d2 && d3 + d2 > d1) {
                System.out.printf("%.3f\n", d1 + d2 + d3);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
