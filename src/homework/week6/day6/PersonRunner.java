package homework.week6.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> workers = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN));

        List<Person> WorkStaff = workers.stream().filter(
                s -> s.getAge() >= 18 & s.getAge() < 55 & s.getSex() == Person.Sex.WOMAN
                        ||
                        s.getAge() >= 18 & s.getAge() < 60 & s.getSex() == Person.Sex.MAN).collect(Collectors.toList());
        System.out.println(WorkStaff.size());

        int count = 0;
        for (Person s : workers) {
            if (s.getAge() >= 18 & s.getAge() < 55 & s.getSex() == Person.Sex.WOMAN || s.getAge() >= 18 & s.getAge() < 60 & s.getSex() == Person.Sex.MAN) {
                count++;
            }
        }
        System.out.println(count);
    }
}
