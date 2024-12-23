package J05026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            String[] w = s.split("\\s+");
            String x = "";
            for (String i : w) {
                x += i.substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + x + ":");
            for (GiangVien i : a) {
                if (x.equals(i.getSj())) {
                    System.out.println(i);
                }
            }
        }
    }
}
// 3
// Nguyen Manh Son
// Cong nghe phan mem
// Vu Hoai Nam
// Khoa hoc may tinh
// Dang Minh Tuan
// An toan thong tin
// 1
// Cong nghe phan mem