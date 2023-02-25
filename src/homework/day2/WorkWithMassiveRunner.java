package homework.day2;

public class WorkWithMassiveRunner {
    public static void main(String[] args) {

        WorkWithMassive start = new WorkWithMassive();
        start.drawCow();


        int[] partOne = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int resultOne = start.sumEveryNElement(partOne, 4);
        System.out.println(resultOne);

        int[] partTwo = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultTwo = start.reverseGreaterElements(partTwo, 5);
        for (int i = 0; i < resultTwo.length; i++) {
            System.out.println(resultTwo[i]);
        }

        int[] partThree = new int[]{100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200};
        int resultThree = start.sumOfCurrentMonth(partThree);
        System.out.println(resultThree);
    }
}
