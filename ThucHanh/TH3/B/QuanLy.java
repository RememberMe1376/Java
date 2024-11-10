package ThucHanh.TH3.B;

import java.text.ParseException;
import java.util.*;

public class QuanLy {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CongNhan> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            CongNhan congNhan = new CongNhan(ma, ten, gioVao, gioRa);
            ds.add(congNhan);
        }
        Collections.sort(ds);
        for (CongNhan i : ds) {
            System.out.println(i);
        }
    }
}
