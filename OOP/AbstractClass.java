abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

abstract class Wagon extends Car  {
    public void drive() {
        System.out.println("Driving");
    }
}

class UpdateWagon extends Wagon {

    public void fly() {
        System.out.println("Flying");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new UpdateWagon();
        // obj.drive();
        obj.playMusic();
    }
}
