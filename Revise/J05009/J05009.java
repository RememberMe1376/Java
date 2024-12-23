package J05009;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05009 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Double max_total = Double.MIN_VALUE;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        for (ThiSinh i : a) {
            if (i.getTongDiem() > max_total) {
                max_total = i.getTongDiem();
            }
        }
        for (ThiSinh i : a) {
            if (i.getTongDiem() == max_total) {
                System.out.println(i);
            }
        }
    }
}
