package J05044;

import java.util.ArrayList;
import java.util.Scanner;

public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }
        String s = sc.nextLine();
        for (NhanVien i : a) {
            if (s.equals(i.getCv())) {
                System.out.println(i);
            }
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
// TP