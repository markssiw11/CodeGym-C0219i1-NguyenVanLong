package circle;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {

    }
    public Cylinder(String color,double radius, double height) {
        super(color,radius);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder("red",3,5);
        System.out.println(cylinder2);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public double getArea() {
        return height*Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return " a cylinder has height:"+height +
                super.toString();
    }
}
