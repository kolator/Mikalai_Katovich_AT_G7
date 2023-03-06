package homework.week3.part2;

public class StringTask_1_2 {

    public static void printDuplicate(String text) {
        int wordStart = 0;
        boolean inWord = false;
        char[] currentWord = new char[text.length()];
        int currentWordLength = 0;
        boolean[] foundDuplicates = new boolean[text.length()];
        int duplicateCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (!inWord) {
                    wordStart = i;
                    inWord = true;
                }
                currentWord[currentWordLength++] = c;
            } else {
                if (inWord) {
                    for (int j = 0; j < i - wordStart - currentWordLength; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(new String(currentWord, 0, currentWordLength));
                    currentWordLength = 0;
                    inWord = false;
                    for (int j = wordStart + 1; j < i; j++) {
                        if (!foundDuplicates[j]) {
                            int k = j + 1;
                            while (k < i && ((text.charAt(k) >= 'a' && text.charAt(k) <= 'z') || (text.charAt(k) >= 'A' && text.charAt(k) <= 'Z'))) {
                                k++;
                            }
                            boolean isDuplicate = true;
                            for (int l = j, m = wordStart + 1; l < k && isDuplicate; l++, m++) {
                                if (text.charAt(l) != currentWord[m]) {
                                    isDuplicate = false;
                                }
                            }
                            if (isDuplicate) {
                                foundDuplicates[j] = true;
                                foundDuplicates[k - 1] = true;
                                duplicateCount++;
                                System.out.println("Duplicate word: " + new String(currentWord, wordStart + 1, currentWordLength - 1));
                            }
                        }
                    }
                }
            }
        }
        if (inWord) {
            for (int j = 0; j < text.length() - wordStart - currentWordLength; j++) {
                System.out.print(" ");
            }
            System.out.println(new String(currentWord, 0, currentWordLength));
        }
        System.out.println("Total number of duplicates: " + duplicateCount);
    }
}
