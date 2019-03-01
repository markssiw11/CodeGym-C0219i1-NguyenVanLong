public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(1, "blue", true);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(3);
        shapes[3] = new Square(2);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.getArea());
                square.howToColor();
            } else {
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
