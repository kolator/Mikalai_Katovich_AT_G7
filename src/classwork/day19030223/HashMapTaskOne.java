package classwork.day19030223;


import java.util.HashMap;
import java.util.Map;


public class HashMapTaskOne {
    public static void main(String[] args) {
        Map<Integer, String> wordMap = new HashMap<>();

        String[] wordsArray = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            wordMap.put(i, wordsArray[i]);
        }
        for (int key : wordMap.keySet()) {
            System.out.println(key);

        }
        for (String word : wordMap.values()) {
            System.out.println(word);

        }
        for (Map.Entry<Integer, String> combo : wordMap.entrySet()){
            System.out.println(combo);
        }
    }
}