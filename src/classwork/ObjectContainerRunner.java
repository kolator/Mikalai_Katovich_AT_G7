package classwork;

public class ObjectContainerRunner {
    public static void main(String[] args) {

        ObjectContainer container = new ObjectContainer();

        for (int i = 1; i <= 10; i++) {
            container.add(i + " qq");
        }
        while (!container.isEmpty()) {
            String element = (String) container.removeLast();
            System.out.println(element);
        }
    }
}