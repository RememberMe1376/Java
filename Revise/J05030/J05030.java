package J05030;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05030 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        int k = 1;
        for (Student i : a) {
            System.out.print(k++ + " ");
            System.out.println(i);
        }
    }
}
// 3
// B20DCCN999
// Nguyen Van An
// D20CQCN04-B
// 10.0
// 9.0
// 8.0
// B20DCAT001
// Le Van Nam
// D20CQAT02-B
// 6.0
// 6.0
// 4.0
// B20DCCN111
// Tran Hoa Binh
// D20CQCN04-B
// 9.0
// 5.0
// 6.0