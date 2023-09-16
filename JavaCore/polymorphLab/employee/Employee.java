package polymorphLab.employee;

// Abstract Employee class
abstract public class Employee {
    abstract public void calculateBonus(Double monthlySalary, Double bonusRate);
}

// Manager class that extends Employee
class Manager extends Employee {

    private final Integer noOfDaysPresent;

    // Constructor for Manager
    public Manager(Integer noOfDaysPresent) {
        this.noOfDaysPresent = noOfDaysPresent;
    }

    // Override the calculateBonus method for Manager
    @Override
    public void calculateBonus(Double monthlySalary, Double bonusRate) {

        // Calculate the bonus for a Manager
        double bonus = 12 * monthlySalary;
        bonus = (bonus * bonusRate) / 100.0;
        bonus += noOfDaysPresent;

        // Print the bonus for the Manager
        System.out.println();
        System.out.println("The bonus of the manager is : " + bonus);
    }
}

// Developer class that extends Employee
class Developer extends Employee {

    private final Integer noOfProjects;

    // Constructor for Developer
    public Developer(Integer noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

    // Override the calculateBonus method for Developer
    @Override
    public void calculateBonus(Double monthlySalary, Double bonusRate) {

        // Calculate the bonus for a Developer
        double bonus = 12 * monthlySalary;
        bonus = (bonus * bonusRate + noOfProjects) / 100.0;

        // Print the bonus for the Developer
        System.out.println();
        System.out.println("The bonus of the developer is : " + bonus);
    }
}

// Tester class that extends Employee
class Tester extends Employee {

    private final Integer noOfBugs;

    // Constructor for Tester
    public Tester(Integer noOfBugs) {
        this.noOfBugs = noOfBugs;
    }

    // Override the calculateBonus method for Tester
    @Override
    public void calculateBonus(Double monthlySalary, Double bonusRate) {

        // Calculate the bonus for a Tester
        double bonus = 12 * monthlySalary;
        bonus = (bonus * bonusRate) / 100.0;
        bonus += noOfBugs * 100.0;

        // Print the bonus for the Tester
        System.out.println();
        System.out.println("The bonus of the tester is : " + bonus);
    }
}

// Main application class
class App {
    public static void main(String[] args) {

        // Create an array of Employees
        Employee[] e = { new Manager(269), new Developer(34), new Tester(29) };
        double diff = 0.0;

        // Calculate and print bonuses for each employee
        for (Employee var : e) {
            var.calculateBonus(75000.0 - diff, 15.5);
            diff += 10000.0;
        }
    }
}
