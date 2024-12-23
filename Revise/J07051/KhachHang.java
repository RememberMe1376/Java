package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String id, ten, phong;
    private Date in, out;
    private int extra;

    public KhachHang(int id, String ten, String phong, String in, String out, int extra) throws ParseException {
        this.id = String.format("KH%02d", id);
        this.ten = formatName(ten);
        this.phong = phong;
        this.in = toDate(in);
        this.out = toDate(out);
        this.extra = extra;
    }

    private Date toDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        if (s.charAt(1) == '/')
            s = "0" + s;
        if (s.charAt(4) == '/')
            s = s.substring(0, 3) + "0" + s.substring(3);
        return sdf.parse(s);
    }

    private String formatName(String ten) {
        String[] words = ten.trim().toLowerCase().split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            formattedName.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return formattedName.toString().trim();
    }

    private long getDays() {
        return TimeUnit.MILLISECONDS.toDays(out.getTime() - in.getTime()) + 1;
    }

    private int getPrice() {
        switch (phong.charAt(0)) {
            case '1':
                return 25;
            case '2':
                return 34;
            case '3':
                return 50;
            case '4':
                return 80;
            default:
                return 0;
        }
    }

    private long total() {
        return getDays() * getPrice() + extra;
    }

    @Override
    public int compareTo(KhachHang o) {
        int cmp = Long.compare(o.total(), this.total());
        if (cmp == 0)
            return this.id.compareTo(o.id);
        return cmp;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + phong + " " + getDays() + " " + total();
    }
}
