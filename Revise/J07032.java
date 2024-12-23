import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032 {

    public static boolean check(Integer n) {
        String s1 = n.toString();
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.length() > 1 && s1.length() % 2 == 1 && s1.equals(s2) && s1.matches("^[13579]+$");
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>) ois.readObject();
        int[] a1 = new int[1000005];
        lst1.forEach(i -> a1[i]++);

        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst2 = (ArrayList<Integer>) ois.readObject();
        int[] a2 = new int[1000005];
        lst2.forEach(i -> a2[i]++);

        int cnt = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (a1[i] > 0 && a2[i] > 0 && check(i)) {
                System.out.println(i + " " + (a1[i] + a2[i]));
                cnt++;
            }
            if (cnt == 10) {
                break;
            }
        }
    }
}
