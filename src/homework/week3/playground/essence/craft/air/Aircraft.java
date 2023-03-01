package homework.week3.playground.essence.craft.air;

import homework.week3.playground.essence.Matter;

abstract class Aircraft extends Matter {
    protected String name;

    public Aircraft(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
