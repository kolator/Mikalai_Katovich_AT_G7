package homework.day0;

public class Car {
    int maxSpeed;
    int speed;
    public void startEngine() {
        System.out.println("Engine started !");
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    public void showSpeed(){
        System.out.println(this.speed);
    }
}
