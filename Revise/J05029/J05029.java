package J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", x, y);
            for (DoanhNghiep i : a) {
                if (i.getSlot() >= x && i.getSlot() <= y) {
                    System.out.println(i);
                }
            }
        }
    }
}
// 4
// VIETTEL
// TAP DOAN VIEN THONG QUAN DOI VIETTEL
// 40
// FSOFT
// CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
// 300
// VNPT
// TAP DOAN BUU CHINH VIEN THONG VIET NAM
// 200
// SUN
// SUN*
// 50
// 1
// 30 50