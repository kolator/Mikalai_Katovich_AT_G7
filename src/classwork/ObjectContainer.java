package classwork;

public class ObjectContainer {
    private Object[] array = new Object[10];
    private int counter = 0;

    public void add(Object incoming) {
        if (counter < array.length) {
            array[counter++] = incoming;
        }
    }

    public Object removeLast() {
        Object lastObject = null;
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
