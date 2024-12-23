package J04006;

import java.util.Scanner;

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String dob = sc.nextLine();
        double gpa = Double.parseDouble(sc.nextLine());
        Student a = new Student(ten, lop, dob, gpa);
        System.out.println(a);
        sc.close();
    }
}
