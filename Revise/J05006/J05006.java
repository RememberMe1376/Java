package J05006;

import java.util.ArrayList;
import java.util.Scanner;

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine()));
        }
        for (NhanVien i : a) {
            System.out.println(i);
        }
    }
}
