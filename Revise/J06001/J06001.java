package J06001;

import java.util.ArrayList;
import java.util.Scanner;

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> lst = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            lst.add(new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String id = sc.next();
            String itemId = id.substring(0, 2);
            long sl = Long.parseLong(sc.next());
            for (SanPham it : lst) {
                if (itemId.equals(it.getId())) {
                    System.out.println(new HoaDon(id, i, sl, it));
                }
            }
        }
    }
}
