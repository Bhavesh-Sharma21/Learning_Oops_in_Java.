public class Encapsulation {

     static class Account{
        private int Acc_no; // private variable
        private String Acc_holder; // private variable
        private double balance; // private variable

        public Account(double balance){
            setBalance(balance);
        }

        // setter method
        public void setBalance (double balance){
            if(balance >= 0){ //validation
                this.balance = balance;
            }
            else{
                System.out.println("Error: Negative balance not allowed !");
            }
        }

        // getter method
        public double getBalance(){
            return balance;
        }
    }
      static class ATMMachine {
        // Private variables: No one can change these directly from outside
        private double cashInMachine = 50000.0;
         int correctPin = 1234;

        // Public method: Controlled way to get cash
        public void withdrawCash(int enteredPin, double amount) {
        // Step 1: Check if the PIN is correct
        if (enteredPin == correctPin) {
            // Step 2: Check if ATM has enough money
            if (amount <= cashInMachine) {
                cashInMachine -= amount; // Deduct money
                System.out.println("Success: Please collect your cash: " + amount);
            } else {
                System.out.println("Error: ATM is out of cash!");
            }
        } else {
            System.out.println("Error: Wrong PIN! Access Denied.");
        }
        } 

        // Getter method: To safely check remaining cash
        public double getRemainingCash() {
        return cashInMachine;
        }
    }

      static  class Employee {
        private String name;
        private String email;
        private double salary;

        public Employee(String name) {
        this.name = name;
        }

        public void setEmail(String email) {
        if (email.contains("@") && email.contains(".com")) {
            this.email = email;
        } else {
            System.out.println("Invalid Email! Must contain @ and .com");
        }
        }

        public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative or zero!");
        }
        }

        public String getEmail() { return email; }
        public double getSalary() { return salary; }
        public String getName() { return name; }
    }
    public static void main(String[] args) {

        Account acc1 = new Account(269473.45);
        System.out.println("Account balance: " + acc1.getBalance());

        ATMMachine atm = new ATMMachine();
        atm.withdrawCash(1234, 5000.0);

        Employee emp = new Employee("Amit Kumar");
        emp.setEmail("amit@gmail.com");
        emp.setSalary(45000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Email: " + emp.getEmail());
        System.out.println("Employee Salary: " + emp.getSalary());  
    }

 
}

