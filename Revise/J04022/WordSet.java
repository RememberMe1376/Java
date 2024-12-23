package J04022;

import java.util.TreeSet;

public class WordSet {
    private String[] s;
    private TreeSet<String> se;

    public WordSet(String a) {
        this.s = a.toLowerCase().trim().split("\\s+");
        this.se = new TreeSet<>();
        for (String i : s) {
            se.add(i);
        }
    }

    public TreeSet<String> getSe() {
        return se;
    }

    public String union(WordSet o) {
        TreeSet<String> union = new TreeSet<>(se);
        for (String i : o.getSe()) {
            union.add(i);
        }
        return String.join(" ", union);
    }

    public String intersection(WordSet o) {
        TreeSet<String> intersection = new TreeSet<>();
        for (String i : se) {
            if (o.getSe().contains(i)) {
                intersection.add(i);
            }
        }
        return String.join(" ", intersection);
    }
}
