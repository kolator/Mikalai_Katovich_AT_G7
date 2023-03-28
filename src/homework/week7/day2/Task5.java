package homework.week7.day2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    public static void main(String[] args) {

        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");


        List<String> countryUpdate = countries
                .filter(country -> country.matches(".*[АаЕеЁёИиОоУуЫыЯяЮюЭэ].*"))
                .filter(country -> country.length() < 7)
                .map(String::toUpperCase)
                .map(country -> "\"" + country +"\"" )
                .collect(Collectors.toList());
        System.out.println(countryUpdate);

    }
}
