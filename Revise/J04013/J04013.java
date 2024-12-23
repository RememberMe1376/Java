package J04013;

import java.util.Scanner;

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String ten = sc.nextLine();
        double toan = Double.parseDouble(sc.nextLine());
        double ly = Double.parseDouble(sc.nextLine());
        double hoa = Double.parseDouble(sc.nextLine());
        ThiSinh a = new ThiSinh(id, ten, toan, ly, hoa);
        System.out.println(a);
    }
}