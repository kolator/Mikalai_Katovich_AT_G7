package homework.week6.task9;

import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        // Проитерировать список через for-each и отпечатать числа в консоль через пробел
        for (double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Посчитать произведение всех чисел и вывести результат в консоль
        double product = 1;
        for (double d : doubles) {
            product *= d;
        }
        System.out.println("Произведение всех чисел: " + product);

        // Найти сумму всех дробных частей и вывести результат в консоль
        double sum = 0;
        for (double d : doubles) {
            sum += d - Math.floor(d);
        }
        System.out.println("Сумма всех дробных частей: " + sum);

        // Проитерировать список по индексу и вывести целые части в консоль через пробел
        for (int i = 0; i < doubles.size(); i++) {
            System.out.print((int) Math.floor(doubles.get(i)) + " ");
        }
        System.out.println();
    }
}