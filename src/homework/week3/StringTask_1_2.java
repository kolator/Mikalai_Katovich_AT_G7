package homework.week3;

public class StringTask_1_2 {
    public static void main(String[] args) {
        printDuplicateWords("Hello World Hello !!!");
    }

    public static void printDuplicateWords(String text) {
        String[] words = text.split("\\s+"); // Разбиваем строку на слова
        String[] uniqueWords = new String[words.length]; // Создаем массив для хранения оригиналов
        int uniqueWordCount = 0;// Создаем переменную для хранения количества слов

        for (String word : words) { // Проходим по всем словам в строке
            boolean isDuplicate = false;

            for (int i = 0; i < uniqueWordCount; i++) { // Проверяем, есть ли слово уже в массиве уникальных слов
                if (uniqueWords[i].equals(word)) {
                    isDuplicate = true; // Если слово уже есть в массиве, это дубликат
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println(word);
                continue;
            }
            uniqueWords[uniqueWordCount] = word; // Добавляем новое уникальное слово в массив
            uniqueWordCount++;
        }
    }
}
