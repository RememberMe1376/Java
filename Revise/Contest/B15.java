package Contest;

import java.util.ArrayList;
import java.util.Scanner;

public class B15 {
    public static String checkError(ArrayList<Integer> a) {
        StringBuilder res = new StringBuilder();
        int n = a.size();
        for (int i = 0; i < n; i++) {
            int start = a.get(i);
            while (i + 1 < n && a.get(i + 1) == a.get(i) + 1) {
                i++;
            }
            int end = a.get(i);
            if (start == end) {
                res.append(start);
            } else {
                res.append(start).append("-").append(end);
            }
            if (i < n - 1) {
                res.append(", ");
            }
        }
        int k = res.lastIndexOf(", ");
        if (k != -1) {
            res.replace(k, k + 2, " and ");
        }
        return res.toString();
    }

    public static String checkCorrect(int n, ArrayList<Integer> a) {
        StringBuilder res = new StringBuilder();
        int x = a.size(), pos = 0;
        ArrayList<String> ranges = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            int start = pos + 1;
            int end = a.get(i) - 1;
            if (start <= end) {
                if (start == end) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "-" + end);
                }
            }
            pos = a.get(i);
        }

        if (pos < n) {
            int start = pos + 1;
            int end = n;
            if (start == end) {
                ranges.add(String.valueOf(start));
            } else {
                ranges.add(start + "-" + end);
            }
        }

        if (ranges.size() > 1) {
            String lastRange = ranges.remove(ranges.size() - 1);
            res.append(String.join(", ", ranges));
            res.append(" and ").append(lastRange);
        } else {
            res.append(ranges.get(0));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int n = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        ArrayList<Integer> a = new ArrayList<>();
        String[] s = sc.nextLine().split(" ");
        for (String i : s) {
            a.add(Integer.parseInt(i));
        }
        System.out.println("Errors: " + checkError(a));
        System.out.println("Correct: " + checkCorrect(n, a));
    }
}
