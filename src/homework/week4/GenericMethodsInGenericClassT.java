package homework.week4;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T obj) {
        System.out.println("I am an object of " + obj.getClass().getSimpleName() + " class");
    }

    public String genericMethodTwoGenArgs(T obj1, T obj2) {
        return "We are objects of " + obj1.getClass().getSimpleName() + " class and " + obj2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T obj, String str) {
        System.out.println("I got an object of " + obj.getClass().getSimpleName() + " class and string with " + str.length() + " characters");
    }

}
