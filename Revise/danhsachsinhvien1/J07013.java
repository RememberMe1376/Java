package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class J07013 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        FileInputStream fis = new FileInputStream("SV.in");
        ObjectInputStream ois = new ObjectInputStream(fis);

        @SuppressWarnings("unchecked")
        ArrayList<SinhVien> danhSach = (ArrayList<SinhVien>) ois.readObject();

        ois.close();
        fis.close();

        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }
    }
}
