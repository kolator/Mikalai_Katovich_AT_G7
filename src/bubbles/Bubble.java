package bubbles;

public class Bubble {
    private double volume;
    private String setup;

    public Bubble(String setup) {
        this.volume = 0.3;
        this.setup = setup;
    }

    public void blowUp() {
        System.out.print(" Cramp !");
    }


}
