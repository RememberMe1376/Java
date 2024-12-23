package J05050;

import java.util.ArrayList;
import java.util.Scanner;

public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Bill(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        a.forEach(System.out::println);
        sc.close();
    }
}

// 3
// KD
// 400
// 555
// NN
// 58
// 400
// CN
// 150
// 700