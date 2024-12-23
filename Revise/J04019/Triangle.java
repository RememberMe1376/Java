package J04019;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        return a.distance(b) + a.distance(c) > b.distance(c) && a.distance(b) + b.distance(c) > a.distance(c)
                && a.distance(c) + b.distance(c) > a.distance(b);
    }

    public String getPerimeter() {
        double res = a.distance(b) + a.distance(c) + b.distance(c);
        return String.format("%.3f", res);
    }
}
