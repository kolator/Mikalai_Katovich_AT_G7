package homework.week3.playground.essence.creatures.plant;

import homework.week3.playground.essence.Matter;

public abstract class Plants extends Matter {

    protected String name;

    public Plants(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
