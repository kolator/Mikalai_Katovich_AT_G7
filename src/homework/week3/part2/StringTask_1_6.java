package homework.week3.part2;
import java.util.Calendar;
public class StringTask_1_6 {


    public static void printCurrentDateTime() {
        Calendar now = Calendar.getInstance();
        String[] months = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        int monthIndex = now.get(Calendar.MONTH);
        String month = months[monthIndex];
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        System.out.println("Сейчас на дворе: " + day + " " + month + ", " + year + ", " + hour + " часа " + minute + " минут");
    }
}
