package polymorphLab.payroll;

public class Payroll {

    // Method to calculate bonus for the Sales department
    public Double calculateBonus(Double salary, Double bonusRate, Double bonusPerSale, Integer numberOfSales) {
        double bonus = (bonusRate * salary) / 100.0; // Calculate bonus based on salary and bonus rate
        bonus += bonusPerSale * numberOfSales; // Add bonus based on the number of sales
        return bonus;
    }

    // Method to calculate bonus for the Engineering department
    public Double calculateBonus(Double salary, Integer numberOfProjects) {
        return (numberOfProjects * salary) / 100.0; // Calculate bonus based on the number of projects and salary
    }

    // Method to calculate bonus for the Marketing department
    public Double calculateBonus(Double salary, Integer noOfDaysPresent, Double bonusRate) {
        double bonus = (bonusRate * salary) / 100.0; // Calculate bonus based on salary and bonus rate
        bonus += noOfDaysPresent; // Add bonus based on the number of days present
        return bonus;
    }

    public static void main(String[] args) {

        double salary = 50000.0, bonusRate = 13.2, bonusPerSale = 300.0, diff = 15000.0;
        int noOfDaysPresent = 272, noOfSales = 1500, noOfProjects = 23;

        Payroll p = new Payroll();

        // Calculate and print the bonus for the Sales department
        System.out.println("The bonus of Sales department is : " + p.calculateBonus(salary, bonusRate, bonusPerSale, noOfSales));

        // Calculate and print the bonus for the Engineering department
        System.out.println("The bonus of Engineering department is : " + p.calculateBonus(salary + diff, noOfProjects));

        // Calculate and print the bonus for the Marketing department
        System.out.println("The bonus of Marketing department is : " + p.calculateBonus(salary + (2 * diff), noOfDaysPresent));
    }
}
