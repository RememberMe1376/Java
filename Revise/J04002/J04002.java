package J04002;

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        if (width > 0 && height > 0) {
            Rectangle a = new Rectangle(width, height, color);
            System.out.println(a);
        } else {
            System.out.println("INVALID");
        }
    }
}
