package homework.week6.taks7;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        // проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        int count = 0;
        // посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        for (String element : elements) {
            if (element.contains(" ")) {
                count++;
            }
        }
        System.out.println("Количество элементов, названия которых состоят более, чем из одного слова: " + count);

        // проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        // на 4-ю позицию добавить Spinner
        elements.add(3, "Spinner");

        // удалить 2-й элемент списка
        elements.remove(1);

        // заменить 5-й элемент на Switch
        elements.set(4, "Switch");

        // проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
