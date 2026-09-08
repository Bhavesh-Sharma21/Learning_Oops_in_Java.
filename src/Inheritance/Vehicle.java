package Inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int noOftyres;

// Default constructor
//    Vehicle(){
//        String name = "";
//        String model = "";
//        int noOftyres = -1;
//    }

    //Prarameterized cotor
    Vehicle(String name,String model, int noOftyres){
        this.name = name;
        this.model = model;
        this.noOftyres = noOftyres;
    }

    void startEngine(){
        System.out.println("Engine is Starting of " + name + " : " + model );
    }

    void stopEngine(){
        System.out.println("Engine is Stopping of " + name + " : " + model );
    }
}
