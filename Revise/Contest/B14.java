package Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            a.add(x);
        }

        double maxVal = Collections.max(a);
        double minVal = Collections.min(a);

        double sum = 0;
        int cnt = 0;

        for (double val : a) {
            if (val != maxVal && val != minVal) {
                sum += val;
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.printf("%.2f", sum / cnt);
        } else {
            System.out.println("0.00");
        }
    }
}
