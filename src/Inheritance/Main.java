package Inheritance;

public class Main {
    static void main() {
        Car c = new Car("maruti", "800", 4,5, "automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCycle M = new MotorCycle("Hero","Splendor +",2,"U","soft");
        M.startEngine();
        M.wheelie();
        M.stopEngine();

    }
}
