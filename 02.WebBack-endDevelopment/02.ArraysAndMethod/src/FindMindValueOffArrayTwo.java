import java.util.Scanner;

public class FindMindValueOffArrayTwo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size= scanner.nextInt();
            if(size>20) {
                System.out.println("sorry, over limited");
            }
        } while (size>20);
        array = new int[size];
        int i=0;
        while (i<array.length) {
            array[i] = scanner.nextInt();
            i++;
        }
        int min=array[0];
        for(i=0;i<array.length;i++) {
         if(min>array[i]) {
             min=array[i];
         }
        }
        System.out.println(min +" is min value off list");
    }
}
