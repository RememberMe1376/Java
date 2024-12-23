package J04012;

import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int ngay = Integer.parseInt(sc.nextLine());
        String chuc = sc.nextLine();
        NhanVien a = new NhanVien(ten, chuc, luong, ngay);
        System.out.println(a);
    }
}
