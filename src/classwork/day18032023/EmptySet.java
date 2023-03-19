package classwork.day18032023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmptySet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String wordsString = "мама мыла раму мыла";
        String[] wordsArray = wordsString.split(" ");
        for (String words : wordsArray) {
            set.add(words);

        }
        System.out.println("for-each");
        for (String word : set) {
            System.out.println(word);
        }

        System.out.println("");

        System.out.println("Iterator");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
