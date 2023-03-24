package homework.week6.task10;

import java.util.ArrayList;

public class Noodles {
    public static void main(String[] args) {
        ArrayList<String> noodles = new ArrayList<String>(); // Создаем пустой список строк
        noodles.add("Hakka"); // Добавляем 4 вида макарон
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        // Итерируемся по списку и выводим слова через тире
        for (String noodle : noodles) {
            System.out.print(noodle + "-");
        }
        System.out.println();

        // Заменяем буквы "а" на букву "о" в каждом слове
        for (int i = 0; i < noodles.size(); i++) {
            String noodle = noodles.get(i);
            noodle = noodle.replace('a', 'o');
            noodles.set(i, noodle);
        }

        // Итерируемся по списку по индексу и выводим слова через пробел
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
        System.out.println();
    }
}
