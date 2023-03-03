package homework.week3.playground.utils;

public class DirectionGenerator {

    public static String generateDirection() {
        int randomNumber = (int) (Math.random() * 40) + 1;
        String direction = "";
        if (randomNumber >= 1 && randomNumber <= 9) {
            direction = "NORTH";
        } else if (randomNumber >= 10 && randomNumber <= 19) {
            direction = "SOUTH";
        } else if (randomNumber >= 20 && randomNumber <= 29) {
            direction = "WEST";
        } else if (randomNumber >= 30 && randomNumber <= 39) {
            direction = "EAST";
        }
        return direction;
    }
}
