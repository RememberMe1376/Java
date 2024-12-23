package Contest.B21;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> lst = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            lst.add(new Student(id, ten, lop, email, sdt));
        }
        Collections.sort(lst);
        for (Student i : lst) {
            System.out.println(i);
        }
    }
}
