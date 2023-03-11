package homework.playground.processors;

import homework.playground.essence.craft.Rideable;
import homework.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        String direction = DirectionGenerator.generateDirection();
        this.runRideable(rideable, direction);
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }

}
