package Inheritance;

class Employee{
    protected String name;
    protected int employeeId;

    public Employee(String name,int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    void display(){
        System.out.println("Employee " + name + ", ID: " + employeeId);
    }
}
//Single Inheritance
class Developer extends Employee{
    private String progLanguage;

    public Developer(String name,int employeeId, String lang){
        super(name, employeeId);
        this.progLanguage = lang;
    }

    void show(){
        System.out.println("Name: " + name + ", Specialization: Developer, Programming Language: " + progLanguage);
    }
}

class Marketingmanager extends Employee{
    public Marketingmanager(String name, int employeeId){
        super(name,employeeId);
    }

    void createMarketingStrategy(){
        System.out.println("Market Manager creatinga Market Strategy.");
    }
}
interface salesManager{
    void boostSales();
}

class BusinessDevelopmentManager extends Marketingmanager implements salesManager{
    public BusinessDevelopmentManager(String name, int employeeId){
        super(name,employeeId);
    }
    public void CoordinateBusinessDevelopment(){
        createMarketingStrategy();
        boostSales();
        System.out.println("Business Development Manager " +name + ", Id: " +employeeId +" coordinating business development efforts.");
    }

    public void boostSales() {
        System.out.println("Sales Manager Boosting Sales.");
    }
}

// Interfaces for multiple inheritance
interface ProjectManager{
    void manageProject();
}
interface Teamlead{
    void leadTeam();
}

//Multiple Inheritance using interfaces
class Techlead extends Employee implements ProjectManager, Teamlead{
    private String projectManaged;

    private int teamSize;

    public Techlead(String name, int employeeId, String project, int teamSize){
        super(name, employeeId);
        this.projectManaged = project;
        this.teamSize = teamSize;
    }

    public void displayInfo(){
        display();
        manageProject();
        leadTeam();
    }

    @Override
    public void manageProject() {
        System.out.println("Project Manager managing project: " + projectManaged);
    }

    @Override
    public void leadTeam() {
        System.out.println("Team lead leading a team of " + teamSize);
    }
}

// Multi-level Inheritance
class HRManager extends Employee{
    public HRManager(String name, int employeeId){
        super(name,employeeId);
    }
    public void handlesHRDurties(){
        System.out.println("HR Manager: " + name +" Id: " + employeeId + " handling Human Resource Duties.");
    }
}
class HRDirector extends HRManager{
    public HRDirector(String name, int employeeId){
        super(name,employeeId);
    }
    public void manageHRDep(){
        System.out.println("HR Manager handles HR Department.");
    }
}
//Hierarchical Inheritance
class Executive extends Employee{
    public Executive(String name, int employeeId){
        super(name,employeeId);
    }
    public void makeExecutiveDecision(){
        System.out.println("Executive Manager make the plan execusitve descision.");
    }
}
class CEO extends Employee{
    public CEO(String name, int employeeId){
        super(name, employeeId);
    }
    public void LeadCompany(){
        System.out.println("CEO " + name +", Id: " + employeeId +" is also a Executive Officer.");
    }
}


public class TypesOfInhareritance {

    static void main(String[] args) {
        //Single Inheritance
        Developer dev = new Developer("Bhavesh Sharma", 021, "Java");
        dev.show();

        //Multiple Inheritance
        Techlead techLead = new Techlead("Yash Kumar Pal", 202,"Scrap2Cash",3);
        techLead.displayInfo();

        //Multi-Level Inheritance
        HRDirector hrdirector = new HRDirector("Lucy Madam", 718);
        hrdirector.handlesHRDurties();
        hrdirector.manageHRDep();

        //Hierarchical Inheritance
        CEO ceo = new CEO("Atul Singh", 001);
        ceo.LeadCompany();


        //Hybrid Inheritance
        BusinessDevelopmentManager BDM = new BusinessDevelopmentManager("Rahul Saini", 765);
        BDM.CoordinateBusinessDevelopment();

    }
}
