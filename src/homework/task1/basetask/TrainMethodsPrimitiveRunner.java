package homework.task1.basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        short b = 12345;
        byte g = -10;
        TrainMethodsPrimitive tmpr = new TrainMethodsPrimitive();
        tmpr.printInt(3);
        tmpr.printLong(123);
        tmpr.printChar('g');
        tmpr.printFloat(22.8F);
        tmpr.printDouble(3.3);
        tmpr.printShort(b);
        tmpr.printByte(g);
        tmpr.printBoolean(false);
    }
}