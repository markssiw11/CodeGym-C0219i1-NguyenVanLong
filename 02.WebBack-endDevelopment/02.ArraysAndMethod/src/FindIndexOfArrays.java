import java.util.Scanner;

public class FindIndexOfArrays {
    public static void main(String[] args) {
        String[] students = {"dell", "jax", "william", "jone"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name you want to find");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("position of the students in the list " + input_name + " is " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}
