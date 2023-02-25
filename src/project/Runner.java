package project;

import project.packing.Bottle;

public class Runner {
    public static void main(String[] args) {
        Bottle bottleOne = new Bottle(0.5);
        Bottle bottleTwo = new Bottle(1);
        Bottle bottleThree = new Bottle(1.5);


        System.out.println("Открываем нольпятку");
        bottleOne.open();
        System.out.println("");

        System.out.println("Открываем литруху");
        bottleTwo.open();
        System.out.println("");

        System.out.println("Открываем полторашку");
        bottleThree.open();
    }
}