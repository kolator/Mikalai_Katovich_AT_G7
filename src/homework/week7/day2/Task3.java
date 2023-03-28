package homework.week7.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
       ArrayList<String> cities = new ArrayList<>(Arrays.asList("Минск","Москва","Берлин"));

        int sumCities = cities.stream().mapToInt(String::length).sum();
        System.out.println(sumCities);

    }
}
