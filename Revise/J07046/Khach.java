package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Khach implements Comparable<Khach> {
    private String id, ten, phong;
    private Date den, di;

    public Khach(int id, String ten, String phong, String den, String di) throws ParseException {
        this.id = String.format("KH%02d", id);
        this.ten = ten;
        this.phong = phong;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
    }

    public long getDays() {
        return TimeUnit.MILLISECONDS.toDays(di.getTime() - den.getTime());
    }

    @Override
    public int compareTo(Khach o) {
        return Long.compare(o.getDays(), getDays());
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + phong + " " + getDays();
    }
}
