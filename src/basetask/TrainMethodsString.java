package basetask;

public class TrainMethodsString {
    public static void main(String[] args) {
    }

    public void printMama() {
        System.out.println("мама мыла раму");
    }

    public void printPapa() {
        System.out.println("папа мыла раму");
    }

    public void printString(String name) {
        System.out.println(name);
    }

    public void printMamaString(String name) {
        if (name != null) {
            System.out.println("мама мыла" + name);
        }
    }
}
