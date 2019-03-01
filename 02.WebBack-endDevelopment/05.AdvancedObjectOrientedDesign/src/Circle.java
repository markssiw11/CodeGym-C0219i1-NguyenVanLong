public class Circle extends Shape {
    private double radius;

    public Circle() {
        double radius = 1.0;
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "a circle with radius " + getRadius()
                + " ,which is a subclass of "
                + super.toString();
    }

    /*@Override
    public void resize(double percent) {
        this.radius = this.radius * percent;
    }

    @Override
    public void resizeRandom() {
        this.setRadius(this.radius * Math.random() * 100);
    }*/

}
