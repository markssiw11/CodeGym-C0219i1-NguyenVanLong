package Point;
public class MoveablePoint extends Point2d {
    public float xSpeed;
    public float ySpeed;

    public MoveablePoint(float x, float y) {
        super(x, y);
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint() {

    }

    public static void main(String[] args) {
        MoveablePoint move = new MoveablePoint();
        System.out.println(move);
        MoveablePoint move1 = new MoveablePoint(1,2,3,4);
        System.out.println(move1);
        MoveablePoint move3 = new MoveablePoint(1,2);
        System.out.println(move3);
    }
    public MoveablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] speed={getXSpeed(),getYSpeed()};
        return speed;
    }

    @Override
    public String toString() {
        return  "speed ("+getXSpeed()+","+getYSpeed()+")"+super.toString();
    }
}
