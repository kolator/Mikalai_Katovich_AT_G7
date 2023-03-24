package homework.week6.task5;

import java.util.ArrayList;

public class Countries {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        // проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
        for (String country : countries) {
            System.out.print(country + ", ");
        }
        System.out.println();

        int count = 0;
        // посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
        for (String country : countries) {
            if (country.length() < 7) {
                count++;
            }
        }
        System.out.println("Количество стран с названием меньше 7 букв: " + count);

        // проитерировать список по индексу и отпечатать слова в консоль с новой строки
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
