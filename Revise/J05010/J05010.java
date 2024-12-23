package J05010;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new MatHang(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        for (MatHang i : a) {
            System.out.println(i);
        }
    }
}
// 3
// May tinh SONY VAIO
// Dien tu
// 16400
// 17699
// Tu lanh Side by Side
// Dien lanh
// 18300
// 25999
// Banh Chocopie
// Tieu dung
// 27.5
// 37