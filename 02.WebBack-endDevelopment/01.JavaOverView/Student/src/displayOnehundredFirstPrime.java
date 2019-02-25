import java.util.Scanner;

public class displayOnehundredFirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number != 2) {
           if(number%2==0) {
               isPrime= false;
            }
        }
        if(isPrime) {
            System.out.printf("%d is a prime",number);
        } else {
            System.out.printf("%d is not a prime",number);
        }
    }

}
