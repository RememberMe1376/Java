package Contest;

import java.util.*;

class TheLoai {
    private static int ID = 0;
    private String id, name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TheLoai(String name) {
        this.id = String.format("TL%03d", ++ID);
        this.name = name;
    }

}

class Phim implements Comparable<Phim> {
    private String id, name, date, genre;
    private int eps;
    private static int ID = 1;

    public Phim(String name, String date, String genre, int eps) {
        this.id = String.format("P%03d", ID++);
        this.name = name;
        this.date = date;
        this.genre = genre;
        this.eps = eps;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return id + " " + genre + " " + date + " Phim so " + id.substring(3) + " " + eps;
    }

    @Override
    public int compareTo(Phim o) {
        int[] check = { 6, 7, 8, 9, 3, 4, 1, 2 };
        for (int i = 0; i < 8; i++) {
            if (date.charAt(check[i]) < o.date.charAt(check[i])) {
                return -1;
            }
            if (date.charAt(check[i]) > o.date.charAt(check[i])) {
                return 1;
            }
        }
        if (name.compareTo(o.name) < 0) {
            return -1;
        }
        if (name.compareTo(o.name) > 0) {
            return 1;
        }
        return Integer.compare(o.eps, eps);
    }
}

public class B12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        TheLoai[] tl = new TheLoai[n];
        Phim[] p = new Phim[m];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            tl[i] = new TheLoai(name);
        }
        for (int i = 0; i < m; i++) {
            String genre = sc.nextLine();
            String date = sc.nextLine();
            String name = sc.nextLine();
            int eps = Integer.parseInt(sc.nextLine());
            p[i] = new Phim(name, date, genre, eps);
        }

        Map<String, String> genreMap = new HashMap<>();
        for (TheLoai i : tl) {
            genreMap.put(i.getId(), i.getName());
        }
        for (Phim i : p) {
            i.setGenre(genreMap.get(i.getGenre()));
        }
        Arrays.sort(p);
        for (Phim i : p) {
            System.out.println(i);
        }
    }
}
