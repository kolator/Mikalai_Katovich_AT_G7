package bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle bottleOne = new Bottle(0.5);
        Bottle bottleTwo = new Bottle(1);
        Bottle bottleThree = new Bottle(1.5);
        SparklingWater water = new SparklingWater("red",  0.5,"zbs", 25);
        Bubble[] bublesOne = new Bubble[5000];
        for (int i = 0; i < 5000; i++) {
            bublesOne[i] = new Bubble("1");
        }
        water.pump(bublesOne);
        bottleOne.setWater(water);
        bottleOne.open();
       // bottleTwo.open();
      //  bottleThree.open();
    }
}