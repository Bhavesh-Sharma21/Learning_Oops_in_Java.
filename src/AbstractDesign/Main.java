package AbstractDesign;

public class Main {
    public static void doBirdstuff(Bird b){ //Calling through Abstract class
        b.fly();
        b.feed();

    }
    static void main(String[] args) {
        doBirdstuff(new Sparrow());  /*Benefits of this is that
        if I could change the implimentation, but I couldn't need to change the code in here*/
        doBirdstuff(new Crow());
//        Bird b = new Sparrow();
//        b.feed();
//        b.fly();
//
//        b = new Crow();
//        b.feed();
//        b.fly();
    }
}
