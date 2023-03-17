package homework.week4.intpotput;

import java.io.*;
import java.util.Scanner;

public class HelloFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу: ");
        String phrase = scanner.nextLine();
        System.out.println("Hello, I just got '" + phrase + "' from you!");
    }
}
