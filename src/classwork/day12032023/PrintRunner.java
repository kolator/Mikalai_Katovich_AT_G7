package classwork.day12032023;

public class PrintRunner {
    public static void main(String[] args) {
        PrintRunner printRunner = new PrintRunner();
        printRunner.printColor("Red");
        printRunner.printColor("Black");
        printRunner.printColor("Yellow");
        printRunner.printColor("Orange");

    }

    public void printColor(String color) {
        if (color.equals(ConstantContainer.RED)) {
            System.out.println("The color is " + ConstantContainer.RED);

        } else if (color.equals((ConstantContainer.BLUE))) {
            System.out.println("The color is " + ConstantContainer.BLUE);

        } else if (color.equals((ConstantContainer.GREEN))) {
            System.out.println("The color is " + ConstantContainer.GREEN);

        } else if (color.equals((ConstantContainer.YELLOW))) {
            System.out.println("The color is " + ConstantContainer.YELLOW);

        } else if (color.equals((ConstantContainer.BLACK))) {
            System.out.println("The color is " + ConstantContainer.BLACK);

        } else System.out.println("The color is UNKNOWN !!!");
    }
}
