package J05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            a.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            for (Student i : a) {
                if (s.equals(i.getDn())) {
                    System.out.println(i);
                }
            }
        }
    }
}
// 6
// B17DCCN016
// Le Khac Tuan Anh
// D17HTTT2
// test1@stu.ptit.edu.vn
// VIETTEL
// B17DCCN107
// Dao Thanh Dat
// D17CNPM5
// test2@stu.ptit.edu.vn
// FPT
// B17DCAT092
// Cao Danh Huy
// D17CQAT04-B
// test3@stu.ptit.edu.vn
// FPT
// B17DCCN388
// Cao Sy Hai Long
// D17CNPM2
// test4@stu.ptit.edu.vn
// VNPT
// B17DCCN461
// Dinh Quang Nghia
// D17CNPM2
// test5@stu.ptit.edu.vn
// FPT
// B17DCCN554
// Bui Xuan Thai
// D17CNPM1
// test6@stu.ptit.edu.vn
// GAMELOFT
// 1
// FPT