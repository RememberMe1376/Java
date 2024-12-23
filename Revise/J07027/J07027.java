package J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07027 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String msv = sc1.nextLine();
            String ten = sc1.nextLine();
            String sdt = sc1.nextLine();
            String[] s = sc3.nextLine().split("\\s+");
            int nhom = Integer.parseInt(s[s.length - 1]);
            lst.add(new SinhVien(msv, ten, sdt, nhom));
        }

        int m = Integer.parseInt(sc2.nextLine());
        String mon = "";
        for (int j = 1; j <= m; j++) {
            mon = sc2.nextLine();
            for (int k = 0; k < lst.size(); k++) {
                if (lst.get(k).getNhom() == j) {
                    lst.get(k).setBaitap(mon);
                }
            }
        }
        Collections.sort(lst);
        lst.forEach(System.out::println);
    }
}
