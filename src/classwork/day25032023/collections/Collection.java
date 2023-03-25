package classwork.day25032023.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        List<String> proMamy = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
//        int count = 0;
//        for (String word : list) {
//            if (word.equals("мама")) {
//                count++;
//            }
//        }
        String findFirst = proMamy.stream().findFirst().orElse("мама");
        System.out.println(findFirst);

        String findMama = proMamy.stream().filter("мама"::equals).findFirst().get();
        System.out.println(findMama);

        String fiveElemet = proMamy.stream().skip(4).findFirst().get();
        System.out.println(fiveElemet);

        List<String> twoList = proMamy.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(twoList);

        List<String> uniqueString = proMamy.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList());
        System.out.println(uniqueString);
    }
}
