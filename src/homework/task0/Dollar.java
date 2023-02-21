public class Dollar {

    public static void main(String[] args) {

        Dollar x = new Dollar();
        x.method1();
        x.method2(23, 45);
        System.out.println(x.method4(2, 3));
        String y = x.method4(2, 3);
        System.out.println(y);

    }

    public void method1(){
        int x = 3;
        int y = 4;
        System.out.println("bugaga");
        System.out.println(method3());
    }

    public void method2(int x, int y){
        System.out.println("bugaga");
    }

    public int method3(){
        int x = 3;
        int y = 4;
        return x + y;
    }

    public String method4(int x, int y){
        return "I have: " + (x + y);
    }


}