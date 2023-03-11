package homework.week3;


public class StringTask_1_3 {
    public static void main(String[] args) {
        findNumbersAndTransformToMassive("Hello 1 2 3 World 4 5 6 789!!!");
    }
    public static void findNumbersAndTransformToMassive(String text) {
        char[] chars = text.toCharArray();
        int[] numbers = new int[chars.length];
        int numCount = 0;
        for (char num : chars) {
            if (Character.isDigit(num)) {
                numbers[numCount] = Character.getNumericValue(num);
                numCount++;
            }
        }
        for (int i = 0; i < numCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
   }