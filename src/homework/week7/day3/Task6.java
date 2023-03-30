package homework.week7.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        String result = birds.stream()
                .map(s -> s.replaceAll("о", "а"))
                .collect(Collectors.joining())
                .replaceAll("ь", "")
                .replaceAll("ъ", "")
                .toLowerCase();
        String[] lines = result.split("б");

        for (String line : lines) {
            System.out.println("--" + line.toLowerCase() + "--");
        }
    }
}