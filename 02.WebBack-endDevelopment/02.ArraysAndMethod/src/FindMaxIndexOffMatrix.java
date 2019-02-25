import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FindMaxIndexOffMatrix {

    public static void main(String[] args) {
        int arr[][];
        int row;
        int column;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        row = scanner.nextInt();
        System.out.println("Enter column");
        column = scanner.nextInt();
        arr = new int[row][column];
        System.out.println("Enter " + arr.length + " rows and " +
                arr[0].length + " columns: ");


        for (int i = 0; i < row; i++) {
            System.out.println("Row " + (i + 1));
            for (int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        int maxIndexX = 0;
        int maxIndexY = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxIndexX = i;
                    maxIndexY = j;
                }
            }
        }
        System.out.println("max off list is: " + max + " coordinates, x: " + maxIndexX + " y: " + maxIndexY);

    }
}
