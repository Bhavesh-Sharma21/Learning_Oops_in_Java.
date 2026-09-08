package Inheritance;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOftyres, int noOfDoors, String transmissionType ){
        super(name, model, noOftyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.startEngine();
    }

    void startAC(){
        System.out.println("AC started of " + name );
    }

}
