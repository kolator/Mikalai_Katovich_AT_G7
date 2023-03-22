package classwork.day19030223;

import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String name : names) {
            System.out.println(name);
        }

        names.set(2, "Оля");
        names.set(4, "Катя");

        System.out.println("");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(i + " - " + name);
        }

        names.remove(3);

        System.out.println("");
        for (String name : names) {
            System.out.printf(String.join(" ", name));
        }
    }
}