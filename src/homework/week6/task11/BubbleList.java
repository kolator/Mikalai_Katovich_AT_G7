package homework.week6.task11;


import java.util.Arrays;
import java.util.List;

import project.properties.Bubble;

public class BubbleList {
    public static void main(String[] args) {
        // Создаем список пузырей
        List<Bubble> bubbles = Arrays.asList(
//                new Bubble("CO2", 1),
//                new Bubble("O2", 4),
//                new Bubble("CO", 5)
        );

        // Итерируемся по списку и выводим объемы через пробел
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.geVolume() + " ");
        }
        System.out.println();

        // Итерируемся по списку и выводим имена через пробел
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.geVolume() + " ");
        }
        System.out.println();

        // Считаем суммарный объем всех пузырей
        int totalVolume = 0;
        for (Bubble bubble : bubbles) {
            totalVolume += bubble.geVolume();
        }
        System.out.println("Total volume: " + totalVolume);

        // Итерируемся по списку по индексу и выводим пузыри через toString() с новой строки
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
