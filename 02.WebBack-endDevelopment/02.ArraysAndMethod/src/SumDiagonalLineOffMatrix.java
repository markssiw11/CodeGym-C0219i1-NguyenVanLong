import java.util.Scanner;

public class SumDiagonalLineOffMatrix {
    public static void main(String[] args) {
        float[][] maxtrix;
        int size;
        Scanner scanner= new Scanner(System.in);
        System.out.println("size of maxtrix: ");
        size= scanner.nextInt();
        maxtrix= new float[size][size];
        for(int i=0;i<maxtrix.length;i++) {
            System.out.println("row "+(i+1));
            for(int j=0;j<maxtrix[i].length;j++) {
                maxtrix[i][j]=scanner.nextFloat();
            }
        }
        System.out.println(" maxtrix: ");
        for(int i=0;i<maxtrix.length;i++) {
            for(int j=0;j<maxtrix[i].length;j++) {
                System.out.print(maxtrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<maxtrix.length;i++) {
            for(int j=0;j<maxtrix[i].length;j++) {
                if(i==j) {
                    sum+= maxtrix[i][j];
                }
            }
        }
        System.out.println("sum of diagonall line of maxtrix is: "+sum);
    }
}
