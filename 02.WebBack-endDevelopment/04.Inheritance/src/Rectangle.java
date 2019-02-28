public class Rectangle extends Shape{
    private double width;
    private double length;
    public  Rectangle() {
        double width,length=1.0;
    }
    public Rectangle(double width,double length) {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length,String color, boolean filled) {
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    double getWidth() {
        return width;
    }
    double getLength() {
        return length;
    }
    void setWidth(double width) {
        this.width=width;
    }
    void setLength(double length) {
        this.length=length;
    }
    double getArea() {
        return width*length;
    }
    double getPerimeter() {
        return (width+length)*2;
    }
    @Override
    public String toString() {
        return "A restangle with width: "
                +width
                +" length: " + length
                + " which is a supclass of "
                + super.toString();
    }
}
