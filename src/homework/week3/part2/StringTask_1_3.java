package homework.week3.part2;


public class StringTask_1_3 {
    public static void findNumbersAndTransformToMassive(String text) {
        char[] chars = text.toCharArray(); //получаю колкцию символов из строки
        int[] numbers = new int[chars.length]; // Создаем массив для цифер
        int numCount = 0;
        for (char num : chars) {
            if (Character.isDigit(num)) {
                numbers[numCount] = num;
                numCount++;
            }
        }
        System.out.println(numbers);
    }
   }