package project.packing;

import project.liquids.SparklingWater;
import project.properties.Bubble;
import project.liquids.Water;

public class Bottle {
    private double volume;
    private int temperature;
    private Bubble[] bubbles;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        this.bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < 10000 * volume; i++) {
            this.bubbles[i] = new Bubble("CO2");
        }
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Water getWater() {
        return water;
    }

    public void open() {
        ((SparklingWater) this.water).setOpened(true);
    }

    public void warm(int temperature) {
        this.temperature = temperature;
        System.out.printf("Warming water to: %s", temperature).println();
    }
}
