package J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Man implements Comparable<Man> {
    private String name;
    private Date dob;

    public Man(String[] lst) throws ParseException {
        this.name = lst[0];
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(lst[1]);
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public int compareTo(Man o) {
        return o.getDob().compareTo(dob);
    }

    @Override
    public String toString() {
        return name;
    }
}
