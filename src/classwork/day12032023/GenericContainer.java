package classwork.day12032023;

public class GenericContainer<T> {
    private T[] array = (T[]) new Object[10];
    private int counter = 0;

    public void add(T incoming) {
        if (counter < array.length) {
            array[counter++] = incoming;
        }
    }

    public T removeLast() {
        T lastObject = null;
        if (counter != 0) {
            lastObject = array[counter - 1];
            array[counter-- - 1] = null;
        }
        return lastObject;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

}