package J05038;

import java.util.ArrayList;
import java.util.Scanner;

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),
                    sc.nextLine()));
        }
        for (NhanVien i : a) {
            sum += i.total();
            System.out.println(i);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
// 5
// Cao Van Vu
// 50000
// 26
// GD
// Bui Thi Trang
// 45000
// 23
// PGD
// Do Van Truong
// 40000
// 25
// PGD
// Nguyen Van Cam
// 37000
// 26
// TP
// Truong Thi Tu Linh
// 45000
// 22
// NV