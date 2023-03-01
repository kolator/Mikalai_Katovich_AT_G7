package homework.week3.playground.essence.craft.field;

import homework.week3.playground.essence.Matter;

abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
