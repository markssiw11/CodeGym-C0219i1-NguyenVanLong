import java.util.Scanner;

public class menuDesign {
    public static void main(String[] args) {

        System.out.println("Number 1: Draw a triangle");
        System.out.println("number 2: Draw a square");
        System.out.println("Number 3: Draw a rectangle");
        System.out.println("Number 0: To Exit");
        System.out.println("choice a number you want");
        Scanner sc = new Scanner(System.in);
        while (true) {
        int choice = sc.nextInt();

            switch (choice) {
                case (1):
                    System.out.println("Dwaw a triangle");
                    System.out.println("******");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case (2):
                    System.out.println("Draw a square");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case (3):
                    System.out.println("Draw a restangle");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case (0):
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}
