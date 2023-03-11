package homework.playground.utils;

public class DistanceGenerator {

    public static int generateDistance() {
        int randomDistance = (int) (Math.random() * 99) + 1;
        System.out.println("DistanceGenerator: I have generated distance with value: " + randomDistance);
        return randomDistance;
    }
}
