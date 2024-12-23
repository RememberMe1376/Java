package J04018;

import java.util.Scanner;

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc res = a.add(b);
            System.out.printf("%s, %s\n", res.mul(a), res.mul(res));
        }
    }
}
