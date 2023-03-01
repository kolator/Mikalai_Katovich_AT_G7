package homework.week3.playground.essence.creatures.animal.vertebrata;

import homework.week3.playground.essence.creatures.animal.Animals;
import homework.week3.playground.essence.creatures.animal.insects.Insects;

abstract class Vertebrata extends Animals{

    public void eat(Insects food) {
        System.out.printf("I am %N and I am eating %D", name, food.getName());
    }
}
