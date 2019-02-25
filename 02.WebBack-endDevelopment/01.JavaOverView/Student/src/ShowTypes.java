public class ShowTypes {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("==========");
        for(int k=0;k<3;k++) {
            for(int h=0;h<5;h++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("==========");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("==========");
            for ( int i = 1; i <= 7 ; i ++){
                for( int j = 1 ; j <= 7-i; j ++) System.out.print(" ");
                for(int k = 1; k <=i ; k ++) System.out.print("* ");
                System.out.println("");
        }
        System.out.println("==========");
            for(int i=1; i<=5;i++) {
                for (int j=1; j<=5-i;j++) System.out.print(" "+" ");
                for( int k=1;k<=i;k++) System.out.print("* ");
                System.out.println("");
            }
    }
}
