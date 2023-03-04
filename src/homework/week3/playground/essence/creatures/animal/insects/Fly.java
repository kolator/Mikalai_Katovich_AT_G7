package homework.week3.playground.essence.creatures.animal.insects;

import homework.week3.playground.essence.Flyable;

public class Fly extends Insects implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction) {

        System.out.printf("I am %s, my name is %s and I'am flying to %s\n", getClass().getSimpleName(), name, direction);
    }
}
