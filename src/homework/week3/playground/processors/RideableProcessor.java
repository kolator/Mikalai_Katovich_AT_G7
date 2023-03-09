package homework.week3.playground.processors;

import homework.week3.playground.essence.craft.Rideable;
import homework.week3.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        String direction = DirectionGenerator.generateDirection();
        this.runRideable(rideable, direction);
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }

}
