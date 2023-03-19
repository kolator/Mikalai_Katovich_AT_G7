package classwork.day18032023;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("" + i);
        }
        long t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);

        t0 = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add("" + i);
        }
        t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);
    }
}
