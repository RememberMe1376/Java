package J05048;

import java.util.*;

public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Bill(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        a.forEach(System.out::println);
    }
}
// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582