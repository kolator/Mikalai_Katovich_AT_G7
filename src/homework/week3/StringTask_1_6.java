package homework.week3;

public class StringTask_1_6 {
    public static void main(String[] args) {
        String dataAndTime = "22.00 07.09.2020";
        printFormattedDateTime(dataAndTime);
    }

    public static void printFormattedDateTime(String dateTimeStr) {
        String[] dateTimeArr = dateTimeStr.split(" ");
        String time = dateTimeArr[0];
        String date = dateTimeArr[1];

        String[] dateArr = date.split("\\.");
        int day = Integer.valueOf(dateArr[0]);
        int month = Integer.valueOf(dateArr[1]);
        int year = Integer.valueOf(dateArr[2]);

        String monthStr = getMonthName(month);

        System.out.println(monthStr + ", " + day + ", " + year + " " + time);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }
}
