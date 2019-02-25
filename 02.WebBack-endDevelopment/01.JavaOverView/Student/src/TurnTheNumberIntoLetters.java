import java.util.Scanner;

public class TurnTheNumberIntoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to read");
        int number = sc.nextInt();
        //if(0<= number <10) {
            switch (number) {
                case (0):
                    System.out.println("zero");
                    break;
                case (1):
                    System.out.println("one");
                    break;
                case (2):
                    System.out.println("two");
                    break;
                case (3):
                    System.out.println("two");
                    break;
                case (4):
                    System.out.println("two");
                    break;
                case (5):
                    System.out.println("two");
                    break;
                case (6):
                    System.out.println("two");
                    break;
                case (7):
                    System.out.println("two");
                    break;
                case (8):
                    System.out.println("two");
                    break;
                case (9):
                    System.out.println("two");
                    break;
                    default:
                        System.out.println("out of ability");
            } //if( 10<=number <20) {

            }
        }

