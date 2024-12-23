package J04021;

import java.util.TreeSet;

public class IntSet {
    private int[] a;
    private TreeSet<Integer> se;

    public IntSet(TreeSet<Integer> se) {
        this.se = new TreeSet<>(se);
    }

    public IntSet(int[] a) {
        this.a = a;
        this.se = new TreeSet<>();
        for (int i : a) {
            this.se.add(i);
        }
    }

    public TreeSet<Integer> getSe() {
        return se;
    }

    public IntSet union(IntSet o) {
        TreeSet<Integer> x = new TreeSet<>(se);
        x.addAll(o.getSe());
        return new IntSet(x);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer i : se) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }
}
