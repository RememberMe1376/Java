package J05041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),
                    sc.nextLine()));
        }
        Collections.sort(a);
        for (NhanVien i : a) {
            System.out.println(i);
        }
    }
}
// 3
// Cao Van Vu
// 50000
// 26
// GD
// Do Van Truong
// 40000
// 25
// PGD
// Truong Thi Tu Linh
// 45000
// 22
// NV