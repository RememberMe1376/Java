package Contest;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class tonglap {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        while (true) {
            String s = n.toString();
            if (s.length() == 1)
                break;
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            n = n1.add(n2);
            System.out.println(n);
        }
        sc.close();
    }
}
