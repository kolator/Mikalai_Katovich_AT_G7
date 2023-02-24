package project.properties;

import project.liquids.Water;

public class Bubble {
    private double volume;
    private String gas;

    public Bubble(String gas) {
        this.volume = 0.3;
        this.gas = gas;
    }

    public void cramp() {
        System.out.print(" Cramp !");
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double geVolume() {
        return volume;
    }

}
