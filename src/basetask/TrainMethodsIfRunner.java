package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf tmri = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул: " + tmri.returnNewInt(3));
        System.out.println("метод returnNewLong вернул: " + tmri.returnNewLong(333));
        System.out.println("метод returnNewChar вернул: " + tmri.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул: " + tmri.returnNewFloat(22.8F));
        System.out.println("метод returnNewDouble вернул: " + tmri.returnNewDouble(3.3));
        tmri.returnNewBoolean(false);
    }
}

