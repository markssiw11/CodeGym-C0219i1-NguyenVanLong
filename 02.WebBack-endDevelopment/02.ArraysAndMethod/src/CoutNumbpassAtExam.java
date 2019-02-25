import java.util.Scanner;

public class CoutNumbpassAtExam {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("sorry, size should not eceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i=0;
        while (i<arr.length) {
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s"," array","");
        for(i=0;i<arr.length;i++) {
            System.out.print( arr[i]+"\t");
        }
        int cout=0;
        for(i=0;i<arr.length;i++) {
            if(arr[i]>=5&&arr[i]<=10) {
                cout=cout+1;
            }
        }
        System.out.println("list has "+cout +" people pass the test.");
    }
}
