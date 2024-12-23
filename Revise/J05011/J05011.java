package J05011;

import java.util.*;

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gamer> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        a.forEach(System.out::println);
    }
}
// 3
// 01T
// Nguyen Van An
// 09:00
// 10:30
// 06T
// Hoang Van Nam
// 15:30
// 18:00
// 02I
// Tran Hoa Binh
// 09:05
// 10:00