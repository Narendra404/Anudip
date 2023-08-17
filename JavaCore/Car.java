import java.util.*;

class Vehicle {

    private String make;
    private String model;

    Vehicle (String make, String model) {

        this.make = make;
        this.model = model;
    }

    // the setter methods are written to remove the warning which suggests
    // the data members be final
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
public class Car extends Vehicle {

    private int year;

    Car(String make, String model, int year) {

        super(make, model);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {

        System.out.println();
        System.out.println("The make of the car is : " + getMake());
        System.out.println("The make of the car is : " + getModel());
        System.out.println("The make of the car is : " + getYear());
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the make of the Car : " );
        String make = sc.nextLine();
        System.out.print("Enter the model of the Car : " );
        String model = sc.nextLine();
        System.out.print("Enter the year the Car was launched : " );
        int year = sc.nextInt();

        Car c = new Car(make, model, year);
        c.display();
    }
}
