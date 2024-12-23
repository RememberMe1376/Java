package J05037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037 {
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
// 4
// DUONG
// KG
// 7500
// 150
// TRUNG
// CHUC
// 10000
// 225
// GAO
// KG
// 14000
// 118
// SUA
// HOP
// 48000
// 430