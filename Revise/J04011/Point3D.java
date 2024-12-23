package J04011;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        Point3D AB = new Point3D((short) (B.getX() - A.getX()), (short) (B.getY() - A.getY()),
                (short) (B.getZ() - A.getZ()));
        Point3D AC = new Point3D((short) (C.getX() - A.getX()), (short) (C.getY() - A.getY()),
                (short) (C.getZ() - A.getZ()));
        Point3D AD = new Point3D((short) (D.getX() - A.getX()), (short) (D.getY() - A.getY()),
                (short) (D.getZ() - A.getZ()));

        Point3D ABC = new Point3D(
                (short) (AB.getY() * AC.getZ() - AB.getZ() * AC.getY()),
                (short) (AB.getZ() * AC.getX() - AB.getX() * AC.getZ()),
                (short) (AB.getX() * AC.getY() - AB.getY() * AC.getX()));

        int res = (ABC.getX() * AD.getX()) + (ABC.getY() * AD.getY()) + (ABC.getZ() * AD.getZ());

        return res == 0;
    }
}
