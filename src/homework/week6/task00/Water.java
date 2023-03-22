package homework.week6.task00;

import java.util.Objects;

public class Water {
    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return color + smell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, smell);
    }

    @Override
    public boolean equals(Object wtr) {
        if (this == wtr) return true;
        if (wtr == null || getClass() != wtr.getClass()) return false;
        Water water = (Water) wtr;
        return Objects.equals(color, water.color) && Objects.equals(smell, water.smell);
    }
}