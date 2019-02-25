import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
    double vnd = 23000;
    double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a money you want to convert");
       usd = sc.nextDouble();
       double result = usd*vnd;
        System.out.println(result);
    }
}
