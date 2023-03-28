package homework.week7.day2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {

        Stream<String> automobiles = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");


        List<String> automobilesUpdate = automobiles.distinct()
                .filter(auto -> auto.contains("и"))
                .skip(1)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(automobilesUpdate);

    }

}
