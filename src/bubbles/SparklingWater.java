package bubbles;

import java.util.Arrays;
import java.lang.reflect.Array;

public class SparklingWater extends Water {
    public SparklingWater(String color, double transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
    }

    private Bubble[] bubbles;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
        for (int i = 0; i < this.bubbles.length; i++) {
            this.bubbles[i].blowUp();
        }
    }
}