package homework.week3.playground.essence.craft.hand;

import homework.week3.playground.essence.Matter;

abstract class Container extends Matter {

    protected String name;

    public Container(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
