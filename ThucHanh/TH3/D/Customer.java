package ThucHanh.TH3.D;

import java.util.*;

public class Customer {
    private String cusID, name, address, proID, buyDate, expriredDate;
    private int soluong, tongGia;

    public void setTongGia(int tongGia) {
        this.tongGia = tongGia;
    }

    public void setExpriredDate(String expriredDate) {
        this.expriredDate = expriredDate;
    }

    public Customer(String cusID, String name, String address, String proID, String buyDate, int soluong) {
        this.cusID = cusID;
        this.name = name;
        this.address = address;
        this.proID = proID;
        this.buyDate = buyDate;
        this.soluong = soluong;
    }

    public String getCusID() {
        return cusID;
    }

    public String getProID() {
        return proID;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public int getSoluong() {
        return soluong;
    }

    public void calculate(ArrayList<Product> p) {
        this.tongGia = 0;
        for (Product i : p) {
            if (i.getProID().compareTo(this.proID) == 0) {
                this.tongGia += i.getPrice() * this.soluong;
            }
        }
    }

    public String ngay() {
        String day = "" + this.expriredDate.charAt(0) + this.expriredDate.charAt(1);
        String month = "" + this.expriredDate.charAt(3) + this.expriredDate.charAt(4);
        String year = this.expriredDate.charAt(6) + this.expriredDate.charAt(7) + this.expriredDate.charAt(8)
                + this.expriredDate.charat(9);
        return year + month + day;
    }

    public String toString() {
        return cusID + " " + name + " " + address + " " + proID + " " + tongGia + " " + expriredDate;
    }
}
