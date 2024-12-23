package Contest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student implements Comparable<Student> {
    private String ten, timeOn, timeOff;
    private long totalTime;

    public Student(String ten, String timeOn, String timeOff) throws ParseException {
        this.ten = ten;
        this.timeOn = timeOn;
        this.timeOff = timeOff;
        this.totalTime = calc();
    }

    private long calc() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date start = sdf.parse(timeOn);
        Date end = sdf.parse(timeOff);
        return (end.getTime() - start.getTime()) / 60000;
    }

    public String getTen() {
        return ten;
    }

    public long getTotalTime() {
        return totalTime;
    }

    @Override
    public int compareTo(Student o) {
        if (totalTime != o.getTotalTime()) {
            return Long.compare(o.totalTime, totalTime);
        }
        return ten.compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return ten + " " + totalTime;
    }
}

public class B13 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String timeOn = sc.nextLine();
            String timeOff = sc.nextLine();
            ds.add(new Student(name, timeOn, timeOff));
        }

        Collections.sort(ds);
        for (Student i : ds) {
            System.out.println(i);
        }
    }
}
