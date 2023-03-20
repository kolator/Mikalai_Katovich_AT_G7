package homework.week6.task1;

import java.util.ArrayList;

public class Butterflies {
    public static void main(String[] args) {
        // Создание пустого списка
        ArrayList<String> butterflies = new ArrayList<>();

        // Добавление 4 бабочек в список
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        // Итерация по списку через for-each и вывод слов в кавычках
        for (String butterfly : butterflies) {
            System.out.print("\"" + butterfly + "\" ");
        }
        System.out.println();

        // Подсчет количества бабочек, содержащих букву "о"
        int count = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("о") || butterfly.contains("O")) {
                count++;
            }
        }
        System.out.println("Количество бабочек, содержащих букву \"о\": " + count);

        // Итерация по списку по индексу и вывод слов в консоль через пробел
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        // Итерация по списку через for-each и вывод слов в консоль через перенос строки
        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }
    }
}

