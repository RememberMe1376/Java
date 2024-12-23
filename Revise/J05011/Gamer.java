package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Gamer implements Comparable<Gamer> {
    private String id, name, start, end;

    public Gamer(String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public Long getTotalTime() {
        Date t1 = null, t2 = null;
        try {
            t1 = new SimpleDateFormat("HH:mm").parse(start);
            t2 = new SimpleDateFormat("HH:mm").parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t2.getTime() - t1.getTime();
    }

    public String timeCount() {
        long totalTime = getTotalTime();
        long hours = TimeUnit.MILLISECONDS.toHours(totalTime);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(totalTime) - TimeUnit.HOURS.toMinutes(hours);
        return String.format("%d gio %d phut", hours, minutes);
    }

    @Override
    public int compareTo(Gamer o) {
        return o.getTotalTime().compareTo(getTotalTime());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + timeCount();
    }
}
