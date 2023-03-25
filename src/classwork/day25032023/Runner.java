package classwork.day25032023;

public class Runner {
    public static void main(String[] args) {

        MyClass mc = new MyClass();
        mc.justMethod(() -> 123.456);

        MyClassTwo mc2 = new MyClassTwo();
        mc2.justMethodTwo(str -> System.out.println(str));

        MyClassThree mc3 = new MyClassThree();
        mc3.justMethodThree(ClassX::new);

    }
}
