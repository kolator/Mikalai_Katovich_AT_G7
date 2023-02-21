import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        new Task().foo();
    }

    public void foo() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Random number:" + array[i]);
        }
        int sum = 0;
        int total = array.length;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Average value is:" + sum / total);
    }
}