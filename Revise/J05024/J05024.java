package J05024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        HashMap<String, String> mp = new HashMap<>();
        mp.put("Ke toan", "DCKT");
        mp.put("Cong nghe thong tin", "DCCN");
        mp.put("An toan thong tin", "DCAT");
        mp.put("Vien thong", "DCVT");
        mp.put("Dien tu", "DCDT");

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for (Student i : a) {
                if (s.equals("Cong nghe thong tin") || s.equals("An toan thong tin")) {
                    if (i.getLop().charAt(0) != 'E' && i.getMsv().contains(mp.get(s))) {
                        System.out.println(i);
                    }
                } else if (i.getMsv().contains(mp.get(s))) {
                    System.out.println(i);
                }
            }
        }
    }
}
// 4
// B16DCCN011
// Nguyen Trong Duc Anh
// D16CNPM1
// sv1@stu.ptit.edu.vn
// B15DCCN215
// To Ngoc Hieu
// D15CNPM3
// sv2@stu.ptit.edu.vn
// B15DCKT150
// Nguyen Ngoc Son
// D15CQKT02-B
// sv3@stu.ptit.edu.vn
// B15DCKT199
// Nguyen Trong Tung
// D15CQKT02-B
// sv4@stu.ptit.edu.vn
// 1
// Ke toan