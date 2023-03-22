package classwork.day19030223;


import java.util.ArrayList;
import java.util.List;

public class Colors {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        System.out.println("");
        for (int i = 0; i < colors.size(); i++) {
            String color = colors.get(i);
            System.out.println(i + " - " + color);
        }
        System.out.println("");
        System.out.println(colors.get(1));
        System.out.println(colors.get(5));
    }
}