package homework.week4;

import homework.playground.*;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> obj1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> obj2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> obj3 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> obj4 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Byte, Float> obj5 = new GenericMethodsInGenericClassTwoParams<>();

        String result1 = obj1.genericMethodGenArgs("a", "b", "c");
        System.out.println(result1);

        String result2 = obj2.genericMethodGenArgs(1, 2);
        System.out.println(result2);

        String result3 = obj3.genericMethodGenArgs(1.0, 2.0);
        System.out.println(result3);

        String result4 = obj4.genericMethodGenArgs(1, 2);
        System.out.println(result4);

        obj1.genericMethodHalfGenArgs("abc", "def");
        obj2.genericMethodHalfGenArgs(123, "ghi");
        obj3.genericMethodHalfGenArgs(1.23, "jkl");
        obj4.genericMethodHalfGenArgs(456, "mno");
        obj5.genericMethodHalfGenArgs((byte) 7, "pqr");
        obj1.genericMethodHalfGenArgs("abc", "stu");
    }

}