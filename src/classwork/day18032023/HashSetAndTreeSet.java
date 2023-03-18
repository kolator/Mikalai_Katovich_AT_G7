package classwork.day18032023;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet {
    public static void main(String[] args) {

        Set<String> setH = new HashSet<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            setH.add("" + i);
        }
        long t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);


        Set<String> setT = new TreeSet<>();
        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            setT.add("" + i);
        }
        t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);
    }
}