package homework.week6.task11;


import java.util.Arrays;
import java.util.List;

import homework.week6.task00.Bubble;

public class BubbleList {
    public static void main(String[] args) {
        // Создаем список пузырей
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(1, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );

        // Итерируемся по списку и выводим объемы через пробел
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        // Итерируемся по списку и выводим имена через пробел
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        // Считаем суммарный объем всех пузырей
        int totalVolume = 0;
        for (Bubble bubble : bubbles) {
            totalVolume += bubble.getVolume();
        }
        System.out.println("Total volume: " + totalVolume);

        // Итерируемся по списку по индексу и выводим пузыри через toString() с новой строки
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
