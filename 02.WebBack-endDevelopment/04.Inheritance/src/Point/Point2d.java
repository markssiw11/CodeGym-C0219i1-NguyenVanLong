package Point;

public class Point2d {
    protected float x;
    protected float y;

    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x=x;
    }
    public void setY(float y) {
        this.y=y;
    }
    public void setXY(float x,float y) {
        this.x=x;
        this.y=y;
    }
    public float[] getXY() {
        float[] xy = {x,y};
        return xy;
    }
    public String toString() {
        return " x: "+x+" y: "+y;
    }
}
