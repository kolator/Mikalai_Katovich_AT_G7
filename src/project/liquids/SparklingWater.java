package project.liquids;

import project.properties.Bubble;

import java.util.Arrays;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private boolean isOpened;


    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    public SparklingWater() {
        this.isOpened();
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    private void isOpened() {
        if (isOpened) {
            this.degas();
        }
    }

    public boolean isSparkle() {
        if (bubbles != null) ;
        return true;
    }


    public void degas() {
        int bubblesArray[];
        while (isSparkle() == true) {
            int part = (10 + 5 * this.getTemperature());
            int end = this.bubbles.length > part ? part : this.bubbles.length;
            Bubble[] degas = Arrays.copyOfRange(this.bubbles, 0, end);
            for (int i = 0; i < degas.length; i++) {
                degas[i].cramp();
            }
            this.bubbles = Arrays.copyOfRange(this.bubbles, end, this.bubbles.length);
        }
    }
}