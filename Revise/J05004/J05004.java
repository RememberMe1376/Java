package J05004;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05004 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for (SinhVien i : a) {
            System.out.println(i);
        }
    }
}
