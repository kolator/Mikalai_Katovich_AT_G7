package homework.week3.playground.essence.creatures.animal.insects;

import homework.week3.playground.essence.creatures.Crawlable;
import homework.week3.playground.essence.creatures.plant.Plants;
import homework.week3.playground.essence.creatures.plant.vegetable.Carrot;

public class Beetle extends Insects implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (home.getMass() / mass >= 1) {
            int familyMembers = home.getMass() / mass;
            System.out.printf("I am %N adn I will nest there with %D my family members!", name, familyMembers);
        } else {
            System.out.printf("This carrot is too small for nesting :(");
        }
    }
}
