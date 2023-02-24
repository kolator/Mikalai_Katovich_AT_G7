package homework.day2;

import java.time.LocalDate;

public class WorkWithMassive {

    int sumEveryNthElement(int[] arr, int n) {
        int sum = 0;
        for (int i = n - 1; i < arr.length; i += n){
            sum += arr[i];
        }
        return sum;
    }
    // next step
    public static int[] reverseGreaterElements(int[] arr, int n) {
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
    public static int[] filterAndReverse(int[] arr, int n) {
        int[] result = new int[arr.length]; // создаем массив для результата
        int count = 0; // счетчик для подсчета количества элементов в результирующем массиве

        // проходимся по всем элементам исходного массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) { // если элемент больше n
                result[count] = arr[i]; // добавляем его в результирующий массив
                count++; // увеличиваем счетчик элементов в результирующем массиве
            }
        }

        int[] finalResult = new int[count]; // создаем массив для результата нужного размера

        // копируем элементы из результирующего массива в обратном порядке в новый массив
        for (int i = count - 1, j = 0; i >= 0; i--, j++) {
            finalResult[j] = result[i];
        }

        return finalResult; // возвращаем результирующий массив
    }
    public static int sumOfMultiplesOfCurrentMonth(int[] arr) {
        int currentMonth = LocalDate.now().getMonthValue(); // получаем текущий месяц
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % currentMonth == 0) { // если элемент кратен текущему месяцу
                sum += arr[i]; // добавляем его к сумме
            }
        }

        return sum;
    }
    public static void drawCow() {
        System.out.println("  ^__^");
        System.out.println("  (oo)\\_______");
        System.out.println(" (__)\") ) \\/  \\");
        System.out.println("     ||----w |\\");
        System.out.println("     ||     ||");
    }


}

