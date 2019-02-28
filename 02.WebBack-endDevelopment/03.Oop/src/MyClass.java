public class MyClass {
    void method11(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    /*public static void main(String[] args) {
        MyClass o = new MyClass();
        int[] x = {9, 1};
        o.method11(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
    */
    public static void main(String[] args) {
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);
    }

    static void m(int[] x) {
        x[0] = 200;
    }


}
