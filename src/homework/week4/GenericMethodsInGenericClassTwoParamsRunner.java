package homework.week4;

import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plane;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> obj1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> obj2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> obj3 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> obj4 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Byte, Float> obj5 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> obj6 = new GenericMethodsInGenericClassTwoParams<>();

        String result1 = obj1.genericMethodGenArgs("a", "b", "c");
        System.out.println(result1);

        String result2 = obj2.genericMethodGenArgs("1", 2);
        System.out.println(result2);

        String result3 = obj3.genericMethodGenArgs("1.0", 2.0);
        System.out.println(result3);

        String result4 = obj4.genericMethodGenArgs(1, 2);
        System.out.println(result4);

        obj1.genericMethodHalfGenArgs("string0", "string1");
        obj2.genericMethodHalfGenArgs("string2", 123, "string3");
        obj3.genericMethodHalfGenArgs("string4", 4.56, "string5");
        obj4.genericMethodHalfGenArgs(789, "string6");
        obj5.genericMethodHalfGenArgs((byte) 10, "string7");

        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        obj6.genericMethodGenArgs(aCopter, aPlane);
        obj6.genericMethodHalfGenArgs(aCopter, aPlane, "RELEASE THE KRAKEN");
    }
}