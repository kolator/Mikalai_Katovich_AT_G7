package classwork.day18032023;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();
        String wordsString = "мама мыла раму мыла";
        String[] wordsArray = wordsString.split(" ");
        for (String words : wordsArray) {
            wordsList.add(words);
        }

        System.out.println("по индексу");
        for (int i = 0; i < wordsList.size(); i++) {
            System.out.println(wordsList.get(i));
        }

        System.out.println();

        System.out.println("for-each");
        for (String word : wordsList) {
            System.out.println(word);
        }
    }
}
