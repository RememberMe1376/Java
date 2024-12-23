package J06004;

import java.util.*;

public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<SinhVien> lst = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lst.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        ArrayList<String> subjects = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            subjects.add(sc.nextLine());
        }
        Collections.sort(lst);
        for (SinhVien i : lst) {
            System.out.println(i + subjects.get(i.getStt() - 1));
        }
    }
}
// 5 2
// B17DTCN001
// Nguyen Chi Linh
// 0987345543
// 1
// B17DTCN011
// Vu Viet Thang
// 0981234567
// 1
// B17DTCN023
// Pham Trong Thang
// 0992123456
// 1
// B17DTCN022
// Nguyen Van Quyet
// 0977865432
// 2
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19