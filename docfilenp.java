import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.lang.Math;

public class docfilenp {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        int a[] = new int[100001];
        for (Integer it : list) {
            a[it]++;
        }
        for (int i = 100; i <= 100000; i++) {
            if (a[i] > 0 && prime(a[i])) {
                System.out.println(i);
            }
        }
        in.close();
    }
}