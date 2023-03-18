package homework.week4.intpotput;

import java.io.*;

public class ListFilesAndFolders {
    public static void main(String[] args) {
        String path = "C:\\QA\\AQA";
        File directory = new File(path);
        File[] filesAndFolders = directory.listFiles();
        for (File fileOrFolder : filesAndFolders) {
            System.out.println(fileOrFolder.getName());
        }
    }
}
