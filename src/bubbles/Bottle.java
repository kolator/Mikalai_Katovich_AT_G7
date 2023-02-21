package bubbles;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;

    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }

    public void open() {
        this.water.degas();
    }
}
