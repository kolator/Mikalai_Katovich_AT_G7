package homework.week4;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X... xs) {
        StringBuilder sb = new StringBuilder("I received " + xs.length + " arguments of type:");
        for (X x : xs) {
            sb.append(" ").append(x.getClass().getSimpleName()).append(" class,");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String genericMethodGenArgs(X x, Y y) {
        return "I received 2 arguments of type: " + x.getClass().getSimpleName() + " class, " + y.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X x, String s) {
        System.out.println("I got an object of " + x.getClass().getSimpleName() + " class and string with " + s.length() + " characters");
    }

    public void genericMethodHalfGenArgs(X x, Y y, String s) {
        System.out.println("I got an object of " + x.getClass().getSimpleName() + " class and " + y.getClass().getSimpleName() + " class and string with " + s.length() + " characters");
    }

}

