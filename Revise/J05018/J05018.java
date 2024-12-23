package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new HocSinh(sc.nextLine(), sc.nextLine().trim().split("\\s+")));
        }
        Collections.sort(a);
        for (HocSinh i : a) {
            System.out.println(i);
        }
    }
}
// 3
// Luu Thuy Nhi
// 9.3 9.0 7.1 6.5 6.2 6.0 8.2 6.7 4.8 5.5
// Le Van Tam
// 8.0 8.0 5.5 9.0 6.8 9.0 7.2 8.3 7.2 6.8
// Nguyen Thai Binh
// 9.0 6.4 6.0 7.5 6.7 5.5 5.0 6.0 6.0 6.0