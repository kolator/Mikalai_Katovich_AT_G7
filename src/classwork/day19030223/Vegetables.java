package classwork.day19030223;

import java.util.ArrayList;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картох");

        for (String vegetable : vegetables) {
            System.out.printf(vegetable + " ");
        }
        System.out.println();

        int count = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < vegetables.size(); i++) {
            String vegetable = vegetables.get(i);
            System.out.print(i + ":" + vegetable + " ");
        }
        System.out.println();

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
    }
}
