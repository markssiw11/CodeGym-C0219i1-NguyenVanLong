import java.util.Scanner;

public class SumOfColumnDetifine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] maxtrix;
        System.out.println("Enter row of matrix:");
        int row;
        row = scanner.nextInt();
        System.out.println("Enter column of matrix: ");
        int column;
        column = scanner.nextInt();
        maxtrix = new float[row][column];
        System.out.println("Enter value of matrix");
        for (int i = 0; i < maxtrix.length; i++) {
            System.out.println("row " + (i + 1));
            for (int j = 0; j < maxtrix[i].length; j++) {
                maxtrix[i][j] = scanner.nextFloat();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < maxtrix.length; i++) {
            for (int j = 0; j < maxtrix[i].length; j++) {
                System.out.print(maxtrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int columnNeedSum;
        int sum = 0;
       do {
           System.out.println("Enter a column you want to sum or enter 0 to exit ");
           columnNeedSum = scanner.nextInt();
           if(columnNeedSum>column) {
               System.out.println("over limited ");
           } else if(columnNeedSum==0) {
               System.exit(0);
           } else {
               for (int i = 0; i < maxtrix.length; i++) {
                   for (int j = 0; j < maxtrix[i].length; j++) {
                       if (columnNeedSum == (j+1)) {
                           sum += maxtrix[i][j];
                       }
                   }
               }
               System.out.println("Sum of column: "+ columnNeedSum+" is: "+ sum);
               sum=0;
           }
       } while (columnNeedSum!=0);


    }
}

