package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        short b = 12345;
        byte g = -10;
        TrainMethodsReturn tmr = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул: " + tmr.returnNewInt(3));
        System.out.println("метод returnNewLong вернул: " + tmr.returnNewLong(333));
        System.out.println("метод returnNewChar вернул: " + tmr.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул: " + tmr.returnNewFloat(22.8F));
        System.out.println("метод returnNewDouble вернул: " + tmr.returnNewDouble(3.3));
        System.out.println("метод returnNewShort вернул: " + tmr.returnNewShort(b));
        System.out.println("метод returnNewByte вернул: " + tmr.returnNewByte(g));
        System.out.println("метод returnNewBoolean вернул: " + tmr.returnNewBoolean(false));
    }
}
