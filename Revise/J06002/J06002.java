package J06002;

import java.util.*;

public class J06002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> lst = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            lst.add(new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> lst2 = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String id = sc.next();
            String itemId = id.substring(0, 2);
            long sl = Long.parseLong(sc.next());
            for (SanPham it : lst) {
                if (itemId.equals(it.getId())) {
                    lst2.add(new HoaDon(id, i, sl, it));
                }
            }
        }
        Collections.sort(lst2);
        lst2.forEach(System.out::println);
    }
}
// 2
// AT
// Ao thun
// 80000
// 45000
// QJ
// Quan Jean
// 220000
// 125000
// 2
// AT1 95
// QJ2 105