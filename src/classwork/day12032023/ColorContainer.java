package classwork.day12032023;

public class ColorContainer {
    public static final MyColor RED = new MyColor("Red", 1);
    public static final MyColor BLUE = new MyColor("Blue", 2);
    public static final MyColor GREEN = new MyColor("Green", 3);
    public static final MyColor YELLOW = new MyColor("Yellow", 4);
    public static final MyColor BLACK = new MyColor("Black", 5);
}
// это всё можно сделать через Энам, Энам можно использовать в  switch
// public enum MyColor {
//    RED("Red", 1),
//    BLUE("Blue", 2),
//    GREEN("Green", 3),
//    YELLOW("Yellow", 4),
//    BLACK("Black", 5);
//
//    private final String name;
//    private final int value;
//
//    private MyColor(String name, int value) {
//        this.name = name;
//        this.value = value;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getValue() {
//        return value;
//    }
//}
