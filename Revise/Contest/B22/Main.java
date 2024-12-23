package Contest.B22;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            int ac = sc.nextInt();
            int sub = sc.nextInt();
            sc.nextLine();
            lst.add(new Student(ten, ac, sub));
        }
        Collections.sort(lst);
        for (Student i : lst) {
            System.out.println(i);
        }
    }
}
