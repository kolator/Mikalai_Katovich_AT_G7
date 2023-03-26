package homework.week6.task13;

import java.util.Arrays;
import java.util.List;

public class WaterRunner {
    public static void main(String[] args) {
        List<Water> waters = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        for (Water w : waters) {
            System.out.println(w.getColor() + "-" + w.getSmell());
        }
    }
}