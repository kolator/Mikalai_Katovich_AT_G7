package classwork.day26032023;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> proMamyFive = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        int sum = proMamyFive.stream().mapToInt(String::length).sum();
        System.out.println(sum);

    }
}
