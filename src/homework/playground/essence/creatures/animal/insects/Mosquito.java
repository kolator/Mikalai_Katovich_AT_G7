package homework.playground.essence.creatures.animal.insects;

import homework.playground.essence.Flyable;

public class Mosquito extends Insects implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction) {

        System.out.printf("I am %s, my name is %s and I'am flying to %s\n", getClass().getSimpleName(), name, direction);
    }
}
