package J05054;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new HocSinh(String.format("HS%02d", i + 1), sc.nextLine(), Double.parseDouble(sc.nextLine())));
            a.get(i).setXeploai();
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            a.get(i).setRank(i + 1);
        }
        for (int i = 1; i < n; i++) {
            if (a.get(i).getDiem() == a.get(i - 1).getDiem()) {
                a.get(i).setRank(a.get(i - 1).getRank());
            }
        }
        a.sort((x, y) -> {
            return x.getId().compareTo(y.getId());
        });
        a.forEach(System.out::println);
    }
}
// 3
// Tran Minh Hieu
// 5.9
// Nguyen Bao Trung
// 8.6
// Le Hong Ha
// 9.2