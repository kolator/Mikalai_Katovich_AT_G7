package homework.week7.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        String[] lines = birds.stream()
                .map(s -> s.replaceAll("о", "а")
                        .replaceAll("[ьъ]", "")
                        .toLowerCase())
                .flatMap(s -> Stream.of(s.split("\\s*б\\s*")))
                .filter(s -> !s.isEmpty())
                .map(s -> "--" + s + "--")
                .toArray(String[]::new);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}