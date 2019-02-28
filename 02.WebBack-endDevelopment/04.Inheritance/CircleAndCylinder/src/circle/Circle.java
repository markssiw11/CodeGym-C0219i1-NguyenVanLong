package circle;

public class Circle {
    public String color ="blue";
    public double radius;
    public Circle() {

    }
    public Circle(String color,double radius) {
        this.color=color;
        this.radius=radius;
    }

    public static void main(String[] args) {
    Circle circle1= new Circle("blue",3);
        System.out.println(circle1);
    }
    //getter setter
    String getColor(){
      return color;
    }
    double getRadius() {
        return radius;
    }
    void setColor(String color) {
        this.color=color;
    }
    void setRadius(double radius) {
        this.radius=radius;
    }
    double getArea() {
        return radius*radius*Math.PI;
    }
    double getPerimeter() {
        return 2*radius*Math.PI;
    }
    public String toString() {
        return " a circle has color is: " +getColor()
                + " radius: "+radius
                + " has area is: "+ getArea()
                + " has perimeter is: "+ getPerimeter();
    }
}
