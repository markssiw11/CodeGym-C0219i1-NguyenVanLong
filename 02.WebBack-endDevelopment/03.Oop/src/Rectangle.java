public class Rectangle {
    int width;
    int height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3, 4);
        rectangle1.display();
        rectangle2.display();
    }

    public int getArea() {
        return width * height;
    }

    public int getHeight() {
        return height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public void display() {
        System.out.println("Restangle{ width " + width + " height " + height + "}");
        System.out.println("Area is:  " + this.getArea() + " perimeter is: " + this.getPerimeter());
    }
}
