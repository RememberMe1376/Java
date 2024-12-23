import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> lst1 = (ArrayList<String>) ois.readObject();
        HashMap<String, Integer> mp = new HashMap<>();
        for (String i : lst1) {
            String[] s = i.trim().toLowerCase().split("\\s+");
            for (String j : s) {
                mp.put(j, 1);
            }
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashMap<String, Integer> mp2 = new HashMap<>();
        while (sc.hasNext()) {
            String x = sc.next().trim().toLowerCase();
            if (mp.get(x) != null && mp2.get(x) == null) {
                System.out.println(x);
                mp2.put(x, 1);
            }
        }
    }
}
