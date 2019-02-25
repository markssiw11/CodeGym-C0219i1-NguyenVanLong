import java.util.Scanner;

public class FindMaxValueOfArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>20) {
                System.out.println("Sorry, size should not eceed 20");
            }
        } while (size>20);
        array = new int[size];
        int i=0;
        while (i<array.length) {
            System.out.println("Enter Element: "+ (i+1)+" : ");
            array[i]= scanner.nextInt();
            i++;
        }
        int max = array[0];
        int index = 0;
        for(int j=0;j<array.length;j++) {
            System.out.println("Element "+(j+1)+" has "+array[j]+" million usd");

            if(max<array[j]) {
                max =array[j];
                index=j;
            }
        }
        System.out.println("position "+(index+1)+ " is the largest property value in the list"+" has "+max+" million USD");
    }
}
