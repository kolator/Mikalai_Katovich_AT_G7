package classwork.day12032023;

public class GenericContainerRunner {

    public static void main(String[] args) {

        GenericContainer<String> container = new GenericContainer<>();

        for (int i = 1; i <= 10; i++) {
            container.add(i+"\\");
        }
        while (!container.isEmpty()) {
            String element = container.removeLast();
            System.out.println(element);
        }
    }
}
