package homework.week3.playground.essence.creatures.animal.vertebrata;

import homework.week3.playground.essence.creatures.animal.Animals;
import homework.week3.playground.essence.creatures.animal.insects.Insects;

public abstract class Vertebrata extends Animals{
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insects food) {
        System.out.printf("I am %N and I am eating %D", name, food.getName());
    }
}
