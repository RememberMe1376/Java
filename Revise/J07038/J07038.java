package J07038;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07038 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));

        ArrayList<SinhVien> student = new ArrayList<>();
        ArrayList<DoanhNghiep> dn = new ArrayList<>();
        ArrayList<ThucTap> tt = new ArrayList<>();

        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i++) {
            student.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        int m = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < m; i++) {
            dn.add(new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine())));
        }

        int k = Integer.parseInt(sc3.nextLine());
        for (int i = 0; i < k; i++) {
            ThucTap a = new ThucTap();
            String[] s = sc3.nextLine().split("\\s+");
            String msvTmp = s[0], dnTmp = s[1];
            for (SinhVien it : student) {
                if (msvTmp.equals(it.getMsv())) {
                    a.setSv(it);
                    break;
                }
            }
            for (DoanhNghiep it : dn) {
                if (dnTmp.equals(it.getId())) {
                    a.setDn(it);
                    break;
                }
            }
            tt.add(a);
        }
        Collections.sort(tt);

        int q = Integer.parseInt(sc3.nextLine());
        while (q-- > 0) {
            String dnId = sc3.nextLine();
            String dnName = "";
            int amount = 0;
            for (DoanhNghiep i : dn) {
                if (dnId.equals(i.getId())) {
                    amount = i.getSl();
                    dnName = i.getTen();
                    break;
                }
            }
            System.out.println("DANH SACH THUC TAP TAI " + dnName + ":");
            for (ThucTap i : tt) {
                if (i.getDn().getId().equals(dnId)) {
                    System.out.println(i);
                    amount--;
                }
                if (amount == 0) {
                    break;
                }
            }
        }
    }
}
