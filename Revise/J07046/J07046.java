package J07046;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<Khach> lst = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            lst.add(new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(lst);
        lst.forEach(System.out::println);
    }
}
