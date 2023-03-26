package classwork.day26032023;

import homework.week6.day6.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<String> proMamyFour = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<Person> peopleTwo = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));


        List<String> separateByCharacter = Collections.singletonList(proMamyFour.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::println).max(String::compareTo).get());
        System.out.println(separateByCharacter);


        Person theLittle = peopleTwo.stream().min(Comparator.comparingInt(a -> a.getAge())).get();
        System.out.println(theLittle);

    }

}
