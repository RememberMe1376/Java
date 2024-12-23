package J04010;

import static java.lang.Math.*;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(pow(x - p.x, 2) + pow(y - p.y, 2));
    }
}
