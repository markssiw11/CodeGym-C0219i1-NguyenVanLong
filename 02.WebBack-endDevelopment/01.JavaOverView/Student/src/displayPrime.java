import java.util.Scanner;

public class displayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to display");
        int number = sc.nextInt();
        int cout, n;
        cout = 1;
        n = 2;
        if (number >= 1) {
            System.out.println("2 ");
            while (cout < number) {
                if (n % 2 != 0) {
                    cout++;
                    System.out.println(n + ",");
                }
                n++;
            }
        }
    }
}
