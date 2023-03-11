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


//public class StringTask_1_4 {
//
//    public static void findAndConvertDigits(String text) {
//        int[] numbers = new int[text.length()]; // Создание массива для хранения чисел
//        int index = 0; // Индекс в массиве чисел
//
//        int numberStart = -1; // Позиция начала текущего числа
//        int number = 0; // Текущее число
//
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if (c >= '0' && c <= '9') { // Если символ является цифрой
//                if (numberStart == -1) { // Если мы еще не находимся внутри числа
//                    numberStart = i;
//                }
//                number = number * 10 + (c - '0'); // Увеличиваем текущее число на значение следующей цифры
//            } else { // Если символ не является цифрой
//                if (numberStart != -1) { // Если мы находимся внутри числа
//                    numbers[index] = number;
//                    index++;
//                    numberStart = -1;
//                    number = 0;
//                }
//            }
//        }
//
//        if (numberStart != -1) { // Если в конце строки находится число
//            numbers[index] = number;
//            index++;
//        }
//
//        for (int i = 0; i < index; i++) {
//            System.out.println(numbers[i]);
//        }
//    }
//}