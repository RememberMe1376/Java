package J04005;

import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String dob = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        ThiSinh ts = new ThiSinh(ten, dob, d1, d2, d3);
        System.out.println(ts);
        sc.close();
    }
}
