package homework.week7;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Создание пустого списка
        ArrayList<String> butterflies = new ArrayList<>();

        // Добавление бабочек в список
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        // Добавление кавычек к каждому элементу списка
        for (int i = 0; i < butterflies.size(); i++) {
            butterflies.set(i, "\"" + butterflies.get(i) + "\"");
        }

        // Оставление только слов, содержащих буквы "а" и "о"
        ArrayList<String> filteredButterflies = new ArrayList<>();
        for (String butterfly : butterflies) {
            if (butterfly.toLowerCase().contains("a") && butterfly.toLowerCase().contains("o")) {
                filteredButterflies.add(butterfly);
            }
        }

        // Вывод слов в консоль с новой строки
        for (String butterfly : filteredButterflies) {
            System.out.println(butterfly);
        }
    }
}