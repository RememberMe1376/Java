package J05027;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05027 {
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
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            s = s.toLowerCase();
            for (GiangVien i : a) {
                if (i.getName().toLowerCase().contains(s)) {
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
// aN