package J05063;

import java.util.TreeMap;

public class DaThuc {
    private TreeMap<Integer, Integer> mp;

    public DaThuc(String s) {
        mp = new TreeMap<>();
        String[] tmp = s.split("\\D+");
        for (int i = 0; i < tmp.length; i += 2) {
            mp.put(Integer.parseInt(tmp[i + 1]), Integer.parseInt(tmp[i]));
        }
    }

    public DaThuc(TreeMap<Integer, Integer> mp) {
        this.mp = mp;
    }

    public TreeMap<Integer, Integer> getMp() {
        return mp;
    }

    public DaThuc cong(DaThuc o) {
        TreeMap<Integer, Integer> x = o.getMp();
        mp.forEach((key, value) -> x.merge(key, value, Integer::sum));
        return new DaThuc(x);
    }

    @Override
    public String toString() {
        String res = "";
        for (Integer i : mp.descendingKeySet()) {
            res += String.format("%d*x^%d ", mp.get(i), i);
        }
        return res.trim().replaceAll(" ", " + ");
    }
}
