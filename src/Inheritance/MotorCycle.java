package Inheritance;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    MotorCycle(String name, String model, int noOftyres, String handleBarStyle, String suspensionType){
        super(name,model,noOftyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;

    }

    void wheelie(){
        System.out.println("Motorcycle " + name + " is doing wheelliee..");
    }

}
