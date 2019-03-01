import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparatorCircle[] circles = new ComparatorCircle[3];
        circles[0] =new ComparatorCircle(3.6);
        circles[1] = new ComparatorCircle();
        circles[2] = new ComparatorCircle(3.5,"indigo",false);

        System.out.println("pre-sorted:");
        for (ComparatorCircle circle:circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for(ComparatorCircle circle:circles) {
            System.out.println(circle);
        }
    }
}
