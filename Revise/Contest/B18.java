package Contest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class B18 {

    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> lst = (ArrayList<Integer>) ois.readObject();
        Set<Integer> se = new TreeSet<>();
        for (Integer i : lst) {
            if (i > 100 && prime(i)) {
                se.add(i);
            }
        }
        for (Integer i : se) {
            System.out.println(i);
        }
    }
}
