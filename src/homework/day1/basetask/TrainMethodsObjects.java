package homework.day1.basetask;

public class TrainMethodsObjects {
    public static void main(String[] args) {

    }

    public void processMouse(Mouse odin) {
        System.out.println(odin.getName() + " " + odin.getAge());
        odin.printMouseDetails();
    }

    public void processSouce(Souce bbq) {
        System.out.println(bbq.getName() + " " + bbq.getColor());
        bbq.printSouceDetails();
    }

    public void processBee(Bee maja) {
        System.out.println(maja.getGender() + " " + maja.getWeight());
        maja.printBeeDetails();
    }

    public void processObstacle(Obstacle block) {
        System.out.println(block.getDescription() + " " + block.getSeverity());
        block.printObstacleDetails();
    }

    public void processPineapple(Pineapple ananas) {
        System.out.println(ananas.getGrade() + " " + ananas.getHeatCapacity());
        ananas.printPineappleDetails();
    }
}