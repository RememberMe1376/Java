package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> lst = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            lst.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

        // Sắp xếp danh sách theo tổng điểm giảm dần, nếu bằng thì theo mã tăng dần
        lst.sort((a, b) -> {
            if (a.getTotal().equals(b.getTotal()))
                return a.getId().compareTo(b.getId());
            return b.getTotal().compareTo(a.getTotal());
        });

        int sl = Integer.parseInt(sc.nextLine());
        double benchmark;
        if (sl >= n) {
            for (ThiSinh i : lst) {
                i.setStatus("TRUNG TUYEN");
            }
            benchmark = lst.get(n - 1).getTotal();
        } else {
            benchmark = lst.get(sl - 1).getTotal();
            for (ThiSinh i : lst) {
                i.setStatus(i.getTotal() >= benchmark ? "TRUNG TUYEN" : "TRUOT");
            }
        }

        System.out.printf("%.1f\n", benchmark);
        lst.forEach(System.out::println);
    }
}
