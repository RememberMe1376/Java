package J05045;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for (NhanVien i : a) {
            System.out.println(i);
        }
    }
}
// 4
// Tran Thi Yen
// NV
// 1000
// 24
// Nguyen Van Thanh
// BV
// 1000
// 30
// Doan Truong An
// TP
// 3000
// 25
// Le Thanh
// GD
// 5000
// 28
