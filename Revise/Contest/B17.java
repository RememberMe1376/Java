package Contest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class B17 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"))) {
            ArrayList<String> lst = (ArrayList<String>) ois.readObject();
            for (String i : lst) {
                StringBuilder binaryString = new StringBuilder();
                for (char c : i.toCharArray()) {
                    if (c == '0' || c == '1') {
                        binaryString.append(c);
                    }
                }

                if (binaryString.length() > 0) {
                    long dec = Long.parseLong(binaryString.toString(), 2);
                    System.out.println(binaryString.toString() + " " + dec);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
