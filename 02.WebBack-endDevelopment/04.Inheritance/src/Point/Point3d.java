package Point;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {

    }

    public Point3d(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d(3,4,5);
        System.out.println(point3d);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] xyz={getX(),getY(),z};
        return xyz;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z=z;
    }

    @Override
    public String toString() {
        return " point 3d has z: "+getZ()
                +super.toString();
    }
}
