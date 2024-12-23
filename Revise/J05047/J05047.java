package J05047;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> itemList = new ArrayList<>();
        ArrayList<String> categoryList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());
            MatHang item = new MatHang(name, quantity, price);

            String categoryId = item.getNameId();
            int index = categoryList.indexOf(categoryId);
            if (index == -1) {
                item.setId(1);
            } else {
                long count = categoryList.stream().filter(category -> category.equals(categoryId)).count();
                item.setId((int) count + 1);
            }
            categoryList.add(categoryId);
            itemList.add(item);
        }
        Collections.sort(itemList);
        itemList.forEach(System.out::println);
    }
}

// 3
// May lanh SANYO
// 12
// 4000000
// Dien thoai Samsung
// 30
// 3230000
// Dien thoai Nokia
// 18
// 1240000