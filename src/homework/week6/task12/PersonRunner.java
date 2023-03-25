package homework.week6.task12;


import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Коля", 32));
        people.add(new Person("Оля", 24));
        people.add(new Person("Вася", 55));
        people.add(new Person("Маша", 63));


        for (Person person : people) {
            System.out.printf(person.getAge() + " ");
        }
        for (Person person : people) {
            System.out.printf(person.getName() + " ");
        }
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}