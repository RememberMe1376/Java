package J05049;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Bill(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        String s = sc.nextLine();
        for (Bill i : a) {
            if (i.getId().startsWith(s)) {
                System.out.println(i);
            }
        }
    }
}
// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582
// B