package homework.week3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringTask_1_5 {
    public static void main(String[] args) {

        printCurrentDateTime();
    }

        public static void printCurrentDateTime () {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy, H часов m минут");
            String formattedDateTime = currentDateTime.format(formatter);
            System.out.println("Сейчас на дворе: " + formattedDateTime);
        }
    }

