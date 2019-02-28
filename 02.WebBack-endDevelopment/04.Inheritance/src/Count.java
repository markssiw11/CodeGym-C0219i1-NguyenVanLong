public class Count {
    private static int count = 0;

    public static void increase() {
        count++;
    }


    public int getCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();

        Count.increase();
        Count.increase();
        Count.increase();

        System.out.println(count1.getCount());
        System.out.println(count2.getCount());
        System.out.println(count3.getCount());

        System.out.println(Count.count);
    }
}
