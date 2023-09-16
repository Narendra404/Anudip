package polymorphLab.vehicle;

// Abstract Vehicle class
abstract public class Vehicle {
    abstract public void calculateRent(Double hours, Double chargePerHour); // Abstract method to calculate the rent
}

// Car class that extends Vehicle
class Car extends Vehicle {

    private final Integer noOfSeats;

    // Constructor for Car
    public Car(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Override the calculateRent method for Car
    @Override
    public void calculateRent(Double hours, Double chargePerHour) {
        // Calculate and print the rent for the car
        System.out.println();
        System.out.println("The rent for the car is : " + (hours + noOfSeats) * chargePerHour);
    }
}

// Bicycle class that extends Vehicle
class Bicycle extends Vehicle {

    // Override the calculateRent method for Bicycle
    @Override
    public void calculateRent(Double hours, Double chargePerHour) {
        // Calculate and print the rent for the bicycle
        System.out.println();
        System.out.println("The rent for the bicycle is : " + hours * chargePerHour);
    }
}

// Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {

    private final Double distance;

    // Constructor for Motorcycle
    public Motorcycle(Double distance) {
        this.distance = distance;
    }

    // Override the calculateRent method for Motorcycle
    @Override
    public void calculateRent(Double hours, Double chargePerHour) {
        // Calculate and print the rent for the motorcycle
        System.out.println();
        System.out.println("The rent for the motorcycle is : " + (hours * chargePerHour + distance));
    }
}

// Main application class
class App {
    public static void main(String[] args) {

        // Create an array of Vehicle objects representing different vehicles
        Vehicle[] v = { new Car(6), new Bicycle(), new Motorcycle(12.5)};

        // Calculate and print the rent for each vehicle
        for (Vehicle var : v) {
            var.calculateRent(5.0, 55.5);
        }
    }
}
