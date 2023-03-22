package homework.week6.task2;

import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class Figures {
    public static void main(String[] args) {
        // Создаем список фигур
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        // Открываем файл для записи
        try (FileWriter writer = new FileWriter("figures.txt")) {
            // Проходимся по списку и записываем фигуры через тире в файл
            for (String figure : figures) {
                writer.write(figure + "-");
            }
            writer.flush(); // Очищаем буфер и записываем данные в файл
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int count = 0; // Счетчик фигур без буквы "и"
        // Проходимся по списку по индексу и отпечатываем фигуры через пробел
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
            // Считаем количество фигур без буквы "и"
            if (!figures.get(i).contains("и")) {
                count++;
            }
        }
        System.out.println(); // Переходим на новую строку

        // Вставляем фигуру "Треугольник" на 3 позицию
        figures.add(2, "Треугольник");

        // Проходимся по списку через for-each и отпечатываем фигуры через пробел
        for (String figure : figures) {
            System.out.print(figure + " ");
        }
        System.out.println(); // Переходим на новую строку

        System.out.println("Количество фигур без буквы \"и\": " + count);
    }
}
