package homework.task1.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects tmo = new TrainMethodsObjects();
tmo.processMouse(new Mouse("Джон Уик",99));
tmo.processSouce(new Souce("Сырный", "Красный"));
tmo.processBee(new Bee("Мужик", 13));
tmo.processObstacle(new Obstacle("Кирпидон","Серьёзный"));
tmo.processPineapple(new Pineapple("Вкусный", 1001110));
    }
}
