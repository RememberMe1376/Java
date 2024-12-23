package J04007;

import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String dob = sc.nextLine();
        String dc = sc.nextLine();
        String tax = sc.nextLine();
        String hd = sc.nextLine();
        NhanVien a = new NhanVien(ten, gt, dob, dc, tax, hd);
        System.out.println(a);
        sc.close();
    }
}
