package homework.week6.task8;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<String>();
        elements.addAll(Arrays.asList("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb"));

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        int count = 0;
        for (String element : elements) {
            if (element.contains(" ")) {
                count++;
            }
        }
        System.out.println("Количество элементов, состоящих из более, чем одного слова: " + count);

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        // На 4-ю позицию добавить Spinner
        elements.add(3, "Spinner");

        // Удалить 2-й элемент списка
        elements.remove(1);

        // Заменить 5-й элемент на Switch
        elements.set(4, "Switch");

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        // Проитерировать список через for-each и отпечатать числа в консоль новой строки
        for (int number : numbers) {
            System.out.println(number);
        }

        // Посчитать сумму всех чисел и вывести результат в консоль
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел: " + sum);

        // Отсортировать список по возрастанию
        Collections.sort(numbers);

        // Проитерировать список по индексу и отпечатать числа в консоль через пробел
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Развернуть список в обратном порядке
        Collections.reverse(numbers);

        // Проитерировать список через for-each и отпечатать числа в консоль через пробел
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}



