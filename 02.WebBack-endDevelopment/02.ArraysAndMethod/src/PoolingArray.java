import java.util.Scanner;

public class PoolingArray {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[4];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("array 1: ");
        while (i < firstArray.length) {
            firstArray[i] = scanner.nextInt();
            i++;
        }
        System.out.println();
        System.out.println("array 2: ");
        int j = 0;
        while (j < secondArray.length) {
            secondArray[j] = scanner.nextInt();
            j++;
        }
        int size = (firstArray.length + secondArray.length);
        int[] thirdArray = new int[size];
        for (int k = 0; k < firstArray.length; k++) {
            thirdArray[k] = firstArray[k];
        }
        for (int k = 0; k < secondArray.length; k++) {
            thirdArray[firstArray.length + k] = secondArray[k];
        }
        System.out.println();
        System.out.println("Array1:");
        for (int k = 0; k < firstArray.length; k++) {
            System.out.print(firstArray[k] + " ");
        }
        System.out.println();
        System.out.println("Array2: ");
        for (int k = 0; k < secondArray.length; k++) {
            System.out.print(secondArray[k] + " ");
        }
        System.out.println();
        System.out.println("Array3: ");
        for (int k = 0; k < thirdArray.length; k++) {
            System.out.print(thirdArray[k] + " ");
        }
    }
}
