package classwork.day26032023;

import homework.week6.day6.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> proMamyThree = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<String> sortViaAlphabet = proMamyThree.stream().sorted().collect(Collectors.toList());
        System.out.println(sortViaAlphabet);

        List<String> sortViaAlphabetAndReverse = proMamyThree.stream().sorted((s1, s2) -> -s1.compareTo(s2)).distinct().collect(Collectors.toList());
        System.out.println(sortViaAlphabetAndReverse);


        List<Person> people = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));

        List<Person> sortPeople = people.stream()
                .sorted((p1, p2) -> {
                    if (p1.getSex() != p2.getSex()) {
                        return p1.getSex().compareTo(p2.getSex());
                    } else {
                        return p1.getAge() - p2.getAge();
                    }
                }).peek(System.out::println).collect(Collectors.toList());

        System.out.println(sortPeople);

    }
}