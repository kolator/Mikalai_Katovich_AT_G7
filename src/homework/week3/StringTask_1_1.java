package homework.week3;

public class StringTask_1_1 {
    public static void printInColumn(String text) {
        char[] chars = text.toCharArray(); //получаю колкцию символов из строки
        for (int i = 0; i < chars.length; i++) { //перечесление букв в тексте
            System.out.println(chars[i]); //печатаю буквы из текста, каждая на новой строке

        }
    }
}