package homework.week6.task00;

import java.util.Objects;

public class Sand {
    private int weight;
    private String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  weight + name;
    }

    @Override
    public boolean equals(Object snd) {
        if (this == snd) return true;
        if (snd == null || getClass() != snd.getClass()) return false;
        Sand sand = (Sand) snd;
        return weight == sand.weight && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }
}
