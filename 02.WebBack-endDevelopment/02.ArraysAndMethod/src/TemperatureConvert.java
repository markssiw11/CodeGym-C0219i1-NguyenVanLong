import java.util.Scanner;

public class TemperatureConvert {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitTocelsius(double fahrenheit) {
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit ;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. FahrenheitToCelsius");
            System.out.println("2. CelsiusToFahrenheit");
            System.out.println("0. ToExit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = sc.nextDouble();
                    System.out.println(" Fahrenheit To Celsius: " + fahrenheitTocelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println(" Celsius To Fahreaheit: "+ celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}
