import java.util.HashSet;
import java.util.TreeSet;


public class TreeSetDemo {
    public static void main(String args[]) {
        //Tao mot tree set
        TreeSet ts = new TreeSet();
        // them cac phan tu toi tree set
        ts.add("C");
        ts.add("A");
        ts.add("A");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");


        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println();
        HashSet hs = new HashSet();
        // add new element to hash set
        hs.add(1);
        hs.add(3);
        hs.add(1);
        hs.add(5);
        hs.add(2);
        hs.add(7);
        hs.add(9);
        hs.add(0);
        System.out.println(hs);
        // crease a new hash set
        HashSet hs1 = new HashSet();
        // add new element to new hash set
        hs1.add("adsa1");
        hs1.add("sgfd2");
        hs1.add("agsfg3");
        hs1.add("Eqweqw4");
        hs1.add("C4rt5");
        hs1.add("Fdf6");
        hs1.add("Ffsdf7");
        //valueable F add two times but print one times.
        System.out.println(hs1);
    }
}
