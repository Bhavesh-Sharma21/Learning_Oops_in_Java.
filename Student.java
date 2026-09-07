    public class Student {
    //Attributes
    public int id; 
    public int age;
    public String name;
    public int noOfSubjects;

    //Default ctor -> Attr. garbage
    public Student(){
        System.out.println("Student default constructor called...");
    }

    // Parameterized constructor 
    public Student(int id, int age, String name, int noOfSubjects){
        System.out.println("Parameterized constructor called...");

        this.id = id; 
        this.age = age; 
        this.name = name;
        this.noOfSubjects = noOfSubjects;
    }

    //Copy constructor

    public Student(Student srcobj){ // srcobj -> A
        System.out.println("copy constructor called...");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.noOfSubjects = srcobj.noOfSubjects;
    }

    //Behavior / Methods
    public void study(){
        System.out.println(name + " Studying");
    }

      public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }

  
}
