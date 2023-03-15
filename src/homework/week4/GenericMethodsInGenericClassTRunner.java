package homework.week4;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Object> objectObj = new GenericMethodsInGenericClassT<>();

        stringObj.genericMethodOneGenArg("hello");
        integerObj.genericMethodOneGenArg(42);
        doubleObj.genericMethodOneGenArg(3.14);
        objectObj.genericMethodOneGenArg(new Object());

        System.out.println(stringObj.genericMethodTwoGenArgs("world", "everyone"));
        System.out.println(integerObj.genericMethodTwoGenArgs(1, 2));
        System.out.println(doubleObj.genericMethodTwoGenArgs(2.71, 6.63));
        System.out.println(objectObj.genericMethodTwoGenArgs("str", 1));

        stringObj.genericMethodHalfGenArgs("hello", "world");
        integerObj.genericMethodHalfGenArgs(123, "test");
        doubleObj.genericMethodHalfGenArgs(3.14, "pi");
        objectObj.genericMethodHalfGenArgs(new Object(), "12345");
    }

}