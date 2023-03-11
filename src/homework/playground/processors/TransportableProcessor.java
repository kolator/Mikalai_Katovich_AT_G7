package homework.playground.processors;

import homework.playground.essence.craft.Transportable;
import homework.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        String className = transportable.getClass().getSimpleName();
        System.out.printf("Transportable %s was moved to %s points\n", className,distance);
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        this.runTransportable(transportable, pointA, pointB);
    }
}