package homework.week3.playground.essence;

public interface Flyable {
    void Aircraft();

    void Mosquito();

    void Fly(String direction) {
        System.out.printf("I am %N, my name is %M and I'am flying to %D", getClass(), name, direction);
    }
}
