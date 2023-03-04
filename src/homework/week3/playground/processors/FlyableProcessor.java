package homework.week3.playground.processors;

import homework.week3.playground.essence.Flyable;
import homework.week3.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String direction = DirectionGenerator.generateDirection();
        this.runFlyable(flyable, direction);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }

}
