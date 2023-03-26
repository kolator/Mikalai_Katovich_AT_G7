package classwork.day26032023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<String> proMamyTwo = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        boolean findMama = proMamyTwo.stream().anyMatch("мама"::equals);
        System.out.println(findMama);

        boolean findM = proMamyTwo.stream().allMatch(s -> s.contains("м"));
        System.out.println(findM);

        List<String> addM = proMamyTwo.stream().map(s -> s + "м").collect(Collectors.toList());
        System.out.println(addM);

        List<String> separateAandDeleteEmpty = proMamyTwo.stream().flatMap(str -> Arrays.stream(str.split("а"))).filter(s -> s.length() > 0).collect(Collectors.toList());
        System.out.println(separateAandDeleteEmpty);

    }

}
