package bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle bottleOne = new Bottle(0.5);
        Bottle bottleTwo = new Bottle(1);
        Bottle bottleThree = new Bottle(1.5);
        SparklingWater water = new SparklingWater("red", 0.5, "zbs", 25);

        Bubble[] bubblesOne = new Bubble[5];
        for (int i = 0; i < 5; i++) {
            bubblesOne[i] = new Bubble("CO2");
        }

        Bubble[] bubblesTwo = new Bubble[10];
        for (int i = 0; i < 10; i++) {
            bubblesTwo[i] = new Bubble("CO2");
        }
        Bubble[] bubblesThree = new Bubble[15];
        for (int i = 0; i < 15; i++) {
            bubblesThree[i] = new Bubble("CO2");
        }

        System.out.println("Открываем нольпятку");
        water.pump(bubblesOne);
        bottleOne.setWater(water);
        bottleOne.open();
        System.out.println("");

        System.out.println("Открываем литруху");
        water.pump(bubblesTwo);
        bottleTwo.setWater(water);
        bottleTwo.open();
        System.out.println("");

        System.out.println("Открываем полторашку");
        water.pump(bubblesThree);
        bottleThree.setWater(water);
        bottleThree.open();
    }
}