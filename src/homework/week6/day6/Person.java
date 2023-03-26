package homework.week6.day6;

public class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public enum Sex{
        MAN, WOMAN
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Person [Name=" + this.name + ", age=" + this.age + ", sex=" + this.sex + "]";
    }

}
