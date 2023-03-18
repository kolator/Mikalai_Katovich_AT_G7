package homework.week4.intpotput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountPunctuationAndWords {
    public static void main(String[] args) {
        String fileName = "C:\\QA\\AQA\\text.txt";
        File file = new File(fileName);
        int wordCount = 0;
        int punctuationCount = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String next = scanner.next();
                if (next.matches("[a-zA-Z]+")) {
                    wordCount++;
                } else {
                    punctuationCount++;
                }
            }
            System.out.println("Количество слов: " + wordCount);
            System.out.println("Количество знаков препинания: " + punctuationCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

