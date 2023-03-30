package homework.week7.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        List<String> result = elements.stream()
                .map(str -> {
                    if (str.length() % 2 == 0) {
                        return String.valueOf(str.length());
                    } else {
                        return str.replace('e', 'o');
                    }
                })
                .distinct()
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
