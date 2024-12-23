package J04016;

import java.util.*;

public class Matrix {
    private int[][] a;

    public Matrix(int r, int c) {
        a = new int[r][c];
    }

    public Matrix(int[][] a) {
        this.a = a;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int getRow() {
        return a.length;
    }

    public int getColumn() {
        return a[0].length;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix o) {
        int[][] res = new int[getRow()][o.getColumn()];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = 0;
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                for (int k = 0; k < getColumn(); k++) {
                    res[i][j] += a[i][k] * o.getA()[k][j];
                }
            }
        }
        return new Matrix(res);
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                ans += a[i][j] + " ";
            }
            ans += "\n";
        }
        return ans;
    }
}
