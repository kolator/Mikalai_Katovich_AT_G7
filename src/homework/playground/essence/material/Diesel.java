package homework.playground.essence.material;

import homework.playground.essence.creatures.animal.Animals;

public class Diesel extends Animals implements Pourable, Powerable{

    public Diesel(int mass, String name) {
        super(mass, name);
    }
}
