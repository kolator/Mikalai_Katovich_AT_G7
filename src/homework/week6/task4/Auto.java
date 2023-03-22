package homework.week6.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Auto {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        // Итерация через for-each и запись в файл
        try {
            FileWriter writer = new FileWriter("cars.txt");
            for (String car : cars) {
                writer.write("\"" + car + "\"-");
                System.out.println("\"" + car + "\"");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        // Удаление авто с названием больше 4 букв
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.length() > 4) {
                iterator.remove();
            }
        }

        // Итерация через for-each и вывод в консоль
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
