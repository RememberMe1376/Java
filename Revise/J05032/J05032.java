package J05032;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Man> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new Man(sc.nextLine().split("\\s+")));
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(n - 1));
    }
}
// 5
// Nam 01/10/1991
// An 30/12/1990
// Binh 15/08/1993
// Tam 18/09/1990
// Truong 20/09/1990