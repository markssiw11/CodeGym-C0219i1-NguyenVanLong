import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoDataStructure {
    public static void main(String[] args) {
        StopWatch stw1 = new StopWatch();
        StopWatch stw2 = new StopWatch();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        stw2.start();
        for (int i = 0; i < 1000000; i++) {
            ll.add(i);
        }
        stw2.end();
        System.out.println("LinkedList has: " + stw2.getElapsedTime() + " milisecond to add 1000000 to list ");
        System.out.println("----------------------------------------------------------------------");

        stw1.start();
        for (int i = 0; i < 1000000; i++) {
            arr.add(i);
        }
        stw1.end();
        System.out.println("Arraylist has: " + stw1.getElapsedTime() + " milisecond to add 1000000 to list");
        HashSet<String> hs = new HashSet<String>();
        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("----------------------------------------------------------------------");

        stw1.start();
        for (int i = 0; i < 1000000; i++) {
            hs.add(i+"hello");
        }
        stw1.end();
        System.out.println("elapsed time is: "+stw1.getElapsedTime());
        System.out.println("----------------------------------------------------------------------");

        stw2.start();
        for (int i = 0; i < 1000000; i++) {
            ts.add(i+1+"hello");
        }
        stw2.end();
        System.out.println("elapsed time is: "+stw2.getElapsedTime());
    }
}
