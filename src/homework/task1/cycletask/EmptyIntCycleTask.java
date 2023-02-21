package homework.task1.cycletask;

import java.util.Arrays;
import java.util.Random;

public class EmptyIntCycleTask {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }

        // продолжение таски, вывод
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // продолжение таски, вывод в обратном порядке
        System.out.println("");
        System.out.println("выводим в обатном порядке");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // продолжение таски, *5 и вывод
        System.out.println("");
        System.out.println("умножаем на 5 и выводим");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * 5 + " ");
        }

        // продолжение таски, квадрат и вывод
        System.out.println("");
        System.out.println("возводим в квадрат и выводим");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
        // продолжение таски, найти мин и вывод
        System.out.println("");
        System.out.println("выводим минимальный елемент");
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            System.out.print(min);
        }


        // продолжение таски, поменять местами 1 и 7
        System.out.println("");
        System.out.println("swap frst <-> lst");
        int frst = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = frst;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        // продолжение таски, сорт A->Z
        System.out.println("");
        System.out.println("sort A->Z");
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
