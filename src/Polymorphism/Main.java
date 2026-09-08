package Polymorphism;

public class Main {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(2,5));
        System.out.println(c.add(3,5,2));
        System.out.println(c.add(5,26,8,5.6));

        //Run-time Polymorphism
        Circle circle = new Circle();
//        c.draw();//Override of Shape.java(Fuction overriding).
//        doDrawingstuff(new Shape());
        doDrawingstuff(circle);//Dynamic Method Dispatch[Upcasting]

        Rect rect = new Rect();
//        r.draw();//Override of Shape.java(Function overriding).
        doDrawingstuff(rect);//Dynamic Method Dispatch[Upcasting]

        Shape s = new Shape();
        doDrawingstuff(s);
    }

    public static void doDrawingstuff(Shape s){
        s.draw();//Polymorphic . //Dynamic Method Dispatch[Upcasting]
    }
}
