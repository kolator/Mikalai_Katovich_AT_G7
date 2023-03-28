package homework.week7.day1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");


        List<Integer> figuresChanges = figures
                .map(String::length)
                .filter(figure -> figure <= 4)
                .collect(Collectors.toList());
        System.out.println(figuresChanges);

    }
}
