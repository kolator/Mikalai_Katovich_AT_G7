package homework.week6.task00;

import java.util.Objects;

public class Bubble {
    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return volume + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    @Override
    public boolean equals(Object bbl) {
        if (this == bbl) return true;
        if (bbl == null || getClass() != bbl.getClass()) return false;
        Bubble bubble = (Bubble) bbl;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }
}
