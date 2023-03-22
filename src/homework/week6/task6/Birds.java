package homework.week6.task6;

import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        // проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int count = 0;
        // посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        for (String bird : birds) {
            int vowels = 0;
            for (char c : bird.toCharArray()) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowels++;
                }
            }
            if (vowels > 1) {
                count++;
            }
        }
        System.out.println("Количество птиц, содержащих больше 1 гласной: " + count);

        // проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        // заменить 3-й элемент списка на Синица
        birds.set(2, "Синица");

        // проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
        System.out.println();
    }
}

