import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle1 = new Circle[3];
        circle1[0] = new Circle(3);
        circle1[1] = new Circle(3.9);
        circle1[2] = new Circle(2);

        System.out.println("Pre-sorted:");
        for (Circle circle : circle1) {
            System.out.println();
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle1, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circle1) {
            System.out.println(circle.getRadius());
        }
    }
}
