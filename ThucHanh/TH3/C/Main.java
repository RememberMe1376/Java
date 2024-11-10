package ThucHanh.TH3.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String phone = sc.nextLine();
            Student s = new Student(id, ten, lop, email, phone);
            ds.add(s);
        }
        Collections.sort(ds);
        for (Student i : ds) {
            System.out.println(i);
        }

    }
}
