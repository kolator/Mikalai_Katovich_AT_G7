package homework.week7.day5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        Integer[] numbers = {626, 435, 9, 1463268, 24, 2237, 33, 9090};
        Set<String> uniqueWords = Stream.of(numbers)
                .filter(num -> !String.valueOf(num).contains("3"))
                .flatMapToInt(num -> Arrays.stream(Integer.toString(num).chars().toArray()))
                .mapToObj(ch -> {
                    switch (ch) {
                        case '0': return "zero";
                        case '1': return "one";
                        case '2': return "two";
                        case '4': return "four";
                        case '5': return "five";
                        case '6': return "six";
                        case '7': return "seven";
                        case '8': return "eight";
                        case '9': return "nine";
                        default: return "";
                    }
                })
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toCollection(HashSet::new));

        uniqueWords.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}