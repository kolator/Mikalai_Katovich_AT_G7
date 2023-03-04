package homework.week3.playground.essence.craft.air;

import homework.week3.playground.essence.Flyable;
import homework.week3.playground.essence.Matter;
import homework.week3.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I'am flying to %s\n", getClass().getSimpleName(), name, direction);
    }

    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and moving from point %s to point %s \n", getClass().getSimpleName(), name, pointA, pointB);
        return (pointB - pointA);
    }
}
