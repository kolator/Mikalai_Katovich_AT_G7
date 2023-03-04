package homework.week3.playground.essence.creatures.animal;

import homework.week3.playground.essence.Matter;
import homework.week3.playground.essence.creatures.plant.Plants;

public abstract class Animals extends Matter {
    protected String name;

    public Animals(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plants food) {
        System.out.printf("I am %N and I am eating %D", name, food.getName());
    }

}
