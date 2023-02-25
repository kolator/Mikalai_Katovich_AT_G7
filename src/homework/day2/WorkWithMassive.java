package homework.day2;

import java.time.LocalDate;

public class WorkWithMassive {
    //part 2.1
    public int sumEveryNElement(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + n) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // part 2.2
    public int[] reverseGreaterElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > n) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    // part 2.3
    public int sumOfCurrentMonth(int[] arr) {
        int currentMonth = LocalDate.now().getMonthValue();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % currentMonth == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    // part 2.4
    public void drawCow() {
        System.out.println("  ^__^");
        System.out.println("  (oo)\\_______");
        System.out.println(" (__)\") ) \\/  \\");
        System.out.println("     ||----w |\\");
        System.out.println("     ||     ||");
    }
}