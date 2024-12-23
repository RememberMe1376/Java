package J07058;

import java.io.*;
import java.util.*;

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        MonHoc[] a = new MonHoc[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String ht = sc.nextLine();
            a[i] = new MonHoc(id, ten, ht);
        }
        Arrays.sort(a);
        for (MonHoc i : a) {
            System.out.println(i);
        }
    }
}
