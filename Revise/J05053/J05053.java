package J05053;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        a.forEach(System.out::println);
    }
}
// 3
// Kaki 2
// K0252
// 80000
// 15
// Jean 1
// J2011
// 200000
// 24
// Jean 2
// J0982
// 150000
// 12