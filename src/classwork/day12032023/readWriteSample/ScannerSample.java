package classwork.day12032023.readWriteSample;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("STOP")) {
                System.out.println("OK. BYE !");
                break;
            }
            System.out.printf("You say '%s' ! ", incoming);
        }
    }

}
