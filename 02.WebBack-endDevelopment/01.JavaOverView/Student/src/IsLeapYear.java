import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year you want to check:");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisible4 = year % 4 == 0;
            if (isDivisible4) {
            boolean isDivisible100 = year % 100 == 0;
                if (isDivisible100) {
                    boolean isDivisible400 = year % 400 == 0;
                    if (isDivisible400) {
                        isLeapYear = true;
                    }
                }else {
                    isLeapYear = true;
                }
        }
        if(isLeapYear) {
            System.out.printf("%d is a leap year",year);
        } else {
            System.out.printf("%d is not a leap year",year);
        }
    }
}
