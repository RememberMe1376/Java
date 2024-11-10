package ThucHanh.TH3.D;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> sp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String proID = sc.nextLine();
            String proName = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            Product p = new Product(proID, proName, price, bh);
            sp.add(p);
        }

        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> kh = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String cusID = "KH" + String.format("%02d", i + 1);
            String name = sc.nextLine();
            String address = sc.nextLine();
            String proID = sc.nextLine();
            String buyDate = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            Customer c = new Customer(cusID, name, address, proID, buyDate, soluong);
            kh.add(c);
        }
        for (int i = 0; i < kh.size(); i++) {
            Customer x = kh.get(i);
            for (int j = 0; j < sp.size(); i++) {
                Product y = sp.get(j);
                if (x.getProID().compareTo(y.getProID()) == 0) {
                    int money = x.getSoluong() * y.getPrice();
                    x.setTongGia(money);
                    LocalDate mua = LocalDate.parse(x.getBuyDate(), DateTimeFormatter.ofPattern("dd//MM/yyyy"));
                    LocalDate newDate = mua.plusMonths(y.getBh());
                    String dateStr = newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    x.setExpriredDate(dateStr);
                }
            }
        }
        Collections.sort(kh, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.ngay().compareTo(o2.ngay()) != 0) {
                    return o1.ngay().compareTo(o2.ngay());
                }
                return o1.getCusID().compareTo(o2.getCusID());
            }
        });
        for (Customer i : kh) {
            System.out.println(i);
        }
    }
}
