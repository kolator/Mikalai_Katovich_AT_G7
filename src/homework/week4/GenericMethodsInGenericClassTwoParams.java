package homework.week4;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X... xArgs) {
        int numArgs = xArgs.length;
        StringBuilder sb = new StringBuilder("I received " + numArgs + " arguments of type: ");
        for (X xArg : xArgs) {
            sb.append(xArg.getClass().getSimpleName()).append(" class, ");
        }
        return sb.toString();
    }

    public String genericMethodGenArgs(X xArg, Y yArg) {
        return "I received 2 arguments of type: " + xArg.getClass().getSimpleName() + " class, "
                + yArg.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X xArg, String strArg) {
        System.out.println("I got an object of " + xArg.getClass().getSimpleName()
                + " class and string with " + strArg.length() + " characters");
    }

    public void genericMethodHalfGenArgs(Y yArg, String strArg, int num) {
        System.out.println("I got an object of " + yArg.getClass().getSimpleName()
                + " class and string with " + strArg.length() + " characters and integer " + num);
    }
}

