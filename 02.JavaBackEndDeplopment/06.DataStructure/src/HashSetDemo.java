import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("con cho");
        hs.add("xuc vat");
        hs.add("xuc sinh");
        hs.add("cmm");
        hs.add("clmm");
        System.out.println(hs);
        HashSet hs1 = new HashSet();
        hs1.add(1);
        hs1.add(6);
        hs1.add(5);
        hs1.add(9);
        hs1.add(8);
        System.out.println(hs1);
        HashSet hs2 = new HashSet();
        hs2.add("m");
        hs2.add("b");
        hs2.add("q");
        hs2.add("d");
        hs2.add("a");
        hs2.add("x");
        System.out.println(hs2);
        HashSet hs3 = new HashSet();
        hs3.add("A");
        hs3.add("X");
        hs3.add("H");
        hs3.add(1);
        hs3.add("P");
        hs3.add(3);
        System.out.println(hs3);
        System.currentTimeMillis();

    }

}
