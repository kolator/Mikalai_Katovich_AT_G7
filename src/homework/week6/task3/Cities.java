package homework.week6.task3;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        // Итерация через for-each
        for (String city : cities) {
            System.out.println(city);
        }

        // Подсчет суммы всех букв
        int lettersSum = 0;
        for (String city : cities) {
            lettersSum += city.length();
        }
        System.out.println("Сумма всех букв: " + lettersSum);

        // Итерация по индексу
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}

