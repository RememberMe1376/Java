package J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new SinhVien(sc.nextLine(), sc.nextLine().split("\\s+")));
        }
        Collections.sort(a);
        a.forEach(System.out::println);
    }
}
// 2
// Nguyen Van Nam
// 168 600
// Tran Thi Ngoc
// 168 600