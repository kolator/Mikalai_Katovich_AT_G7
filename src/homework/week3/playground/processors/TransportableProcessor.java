package homework.week3.playground.processors;

import homework.week3.playground.essence.craft.Transportable;
import homework.week3.playground.utils.CoordinatesGenerator;
import homework.week3.playground.utils.DirectionGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        String className = transportable.getClass().getSimpleName();
        System.out.printf("Transportable %s was moved to %s points\n", getClass().getSimpleName(),distance);
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        this.runTransportable(transportable, pointA, pointB);
    }
}