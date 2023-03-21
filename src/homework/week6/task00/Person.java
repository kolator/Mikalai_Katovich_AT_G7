package homework.week6.task00;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return age + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object ppl) {
        if (this == ppl) return true;
        if (ppl == null || getClass() != ppl.getClass()) return false;
        Person person = (Person) ppl;
        return age == person.age && Objects.equals(name, person.name);
    }
}

