package Contest;

import java.util.*;
import java.io.*;

public class B19 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> emailMap = new HashMap<>();
        Set<String> nameSet = new HashSet<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if (line.isEmpty())
                continue;

            String[] parts = line.toLowerCase().split("\\s+");
            StringBuilder normalizedName = new StringBuilder();

            for (String part : parts) {
                normalizedName.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1));
                normalizedName.append(" ");
            }
            String finalName = normalizedName.toString().trim();

            if (nameSet.contains(finalName))
                continue;
            nameSet.add(finalName);

            String lastName = parts[parts.length - 1];
            StringBuilder email = new StringBuilder(lastName);

            for (int i = 0; i < parts.length - 1; i++) {
                email.append(parts[i].charAt(0));
            }

            String emailStr = email.toString();
            int count = emailMap.getOrDefault(emailStr, 0);
            emailMap.put(emailStr, count + 1);

            if (count > 0) {
                emailStr += (count + 1);
            }

            System.out.println(emailStr + "@ptit.edu.vn");
        }
    }
}
