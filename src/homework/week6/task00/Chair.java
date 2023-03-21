package homework.week6.task00;

import java.util.Objects;

public class Chair {
    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "" + height + width;
    }

    @Override
    public boolean equals(Object snd) {
        if (this == snd) return true;
        if (snd == null || getClass() != snd.getClass()) return false;
        Chair chair = (Chair) snd;
        return height == chair.height && width == chair.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }
}