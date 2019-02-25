import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Enter your Weight: ");
        weight = sc.nextDouble();
        System.out.println("Enter your height:");
        height= sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if(bmi<18.5) {
            System.out.printf("%-20.2f%s",bmi,"underWeight");
        } else if (bmi<25.0) {
            System.out.printf("%-20.2f%s",bmi,"normal");
        } else if (bmi<30.0) {
            System.out.printf("%-20.2f%s",bmi,"overweight");
        } else {
            System.out.printf("%-20.2f%s",bmi,"obese");
        }
    }
}
