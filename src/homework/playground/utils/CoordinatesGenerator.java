package homework.playground.utils;

public class CoordinatesGenerator {
    public static int generateCoordinate(){
        int randomNumber = (int) (Math.random() * 79) + 1;
        System.out.println("I have generated point with value: " + randomNumber);
        return randomNumber;
    }
}
