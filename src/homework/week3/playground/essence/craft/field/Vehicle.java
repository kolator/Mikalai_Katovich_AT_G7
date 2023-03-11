package homework.week3.playground.essence.craft.field;

import homework.week3.playground.essence.Matter;
import homework.week3.playground.essence.craft.Rideable;
import homework.week3.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and moving from point %s to point %s \n", getClass().getSimpleName(), name, pointA, pointB);
        return (pointB - pointA);
    }

    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I am driving to %s \n", getClass().getSimpleName(), this.name, direction);

    }
}
