package homework.week4.intpotput;

import java.io.*;
import java.util.Random;

public class CreateFiles {
    public static void main(String[] args) {
        String rootPath = "C:/example"; // указываем корневую директорию
        String folderName = "folder"; // имя папки
        String fileName = "file.txt"; // имя файла
        Random random = new Random();

        // создаем цепочку из 4-х вложенных папок
        File rootDir = new File(rootPath);
        if (!rootDir.exists()) {
            rootDir.mkdir();
        }
        File subDir = rootDir;
        for (int i = 1; i <= 4; i++) {
            subDir = new File(subDir.getPath() + "/" + folderName + i);
            if (!subDir.exists()) {
                subDir.mkdir();
            }
        }

        // создаем файлы и заполняем их числами
        try {
            for (int i = 1; i <= 2; i++) {
                File file = new File(subDir.getPath() + "/" + fileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter writer = new FileWriter(file);
                for (int j = 1; j <= 10; j++) {
                    int num = random.nextInt(100); // генерируем случайное число от 0 до 99
                    writer.write(num + "\n"); // записываем число в файл
                }
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Цепочка из 4-х вложенных папок создана, файлы заполнены числами.");
    }
}

