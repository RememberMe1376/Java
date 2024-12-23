package J06006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J06006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> cus = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            cus.add(new Customer(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Item> item = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            item.add(new Item(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }

        int k = Integer.parseInt(sc.nextLine());
        ArrayList<Receipt> re = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            String cusId = sc.next();
            String itemId = sc.next();
            Customer cusTmp = new Customer();
            Item itemTmp = new Item();
            for (Customer e : cus) {
                if (e.getId().equals(cusId)) {
                    cusTmp = e;
                }
            }
            for (Item e : item) {
                if (itemId.equals(e.getId())) {
                    itemTmp = e;
                }
            }
            re.add(new Receipt(i, cusTmp, itemTmp, Integer.parseInt(sc.next())));
        }
        Collections.sort(re);
        re.forEach(System.out::println);
    }
}
// 2
// Nguyen Van Nam
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
// Tran Van Binh
// Nam
// 11/14/1995
// Phung Khoang-Nam Tu Liem-Ha Noi
// 2
// Ao phong tre em
// Cai
// 25000
// 41000
// Ao khoac nam
// Cai
// 240000
// 515000
// 3
// KH001 MH001 2
// KH001 MH002 3
// KH002 MH002 4