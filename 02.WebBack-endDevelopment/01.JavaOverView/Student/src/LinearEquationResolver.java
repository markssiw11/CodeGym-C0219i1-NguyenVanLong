import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a: ");
        a = sc.nextDouble();
        System.out.println("b: ");
        b= sc.nextDouble();
        System.out.println("c: ");
        c= sc.nextDouble();
        if(a!=0) {
            double answers = (c - b) / a;
            System.out.printf("Equation Pass With x = %f!\n",answers);
        }else {
            if(b==0) {
                System.out.println("The Solution Is Al x!");
            } else {
                System.out.println("No Solution");
            }

        }
    }
}
