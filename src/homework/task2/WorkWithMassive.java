package homework.task2;

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
}

