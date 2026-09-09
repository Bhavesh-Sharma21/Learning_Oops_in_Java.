package AbstractDesign;

//abstract class Bird { //Create Abstract class
//    abstract void fly();
//    abstract void feed();
//}
//class Sparrow extends Bird{ //Implimentation
//    @Override
//    void fly(){
//        System.out.println("Sparrow is flying.");
//    }
//    @Override
//    void feed(){
//        System.out.println("Sparrow is feeding.");
//    }
//}
//
//class Crow extends Bird{ //Implimentation
//    @Override
//    void fly(){
//        System.out.println("Crow is flying.");
//    }
//
//    @Override
//    void feed(){
//        System.out.println("Crow is feeding.");
//    }
//
//}

//New way in JAVA to doing Abstraction
interface Bird{

    void fly(); //It's by default public

    void feed();
}

class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow flying..");
    }

    @Override
    public void feed() {
        System.out.println("Sparrow Eating..");
    }
}

class Crow implements Bird{

    @Override
    public void fly() {
        System.out.println("Crow flying..");
    }

    @Override
    public void feed() {
        System.out.println("Crow feeding..");
    }
}