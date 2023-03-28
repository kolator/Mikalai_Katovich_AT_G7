package homework.week7.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");


        List<String> addButterflies =
                butterflies.stream().map(s -> "\"" + s + "\"")
                        .filter(s -> s.toLowerCase().contains("a") && s.toLowerCase().contains("o"))
                        .collect(Collectors.toList());
        System.out.println(addButterflies);

    }
}
