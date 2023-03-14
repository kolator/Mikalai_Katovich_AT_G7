package homework.week4;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T arg) {
        System.out.println("I am an object of " + arg.getClass().getSimpleName() + " class");
    }

    public <U> String genericMethodTwoGenArgs(T arg1, U arg2) {
        return "We are objects of " + arg1.getClass().getSimpleName() + " class and " + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T arg1, String arg2) {
        System.out.println("I got an object of " + arg1.getClass().getSimpleName() + " class and string with " + arg2.length() + " characters");
    }
}
