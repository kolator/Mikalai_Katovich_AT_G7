package basetask;

public class Souce {
    private String name;
    private String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + this.name + " " + this.color + " цвета");
    }

}