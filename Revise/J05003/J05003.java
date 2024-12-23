package J05003;

import java.util.Scanner;

public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            Double gpa = Double.parseDouble(sc.nextLine());
            SinhVien a = new SinhVien(ten, lop, dob, gpa);
            System.out.println(a);
        }
    }
}
