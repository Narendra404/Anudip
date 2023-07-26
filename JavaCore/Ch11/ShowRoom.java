import java.util.*;

public class ShowRoom {

    String name;
    long mobno;
    double cost, dis, amount;

    ShowRoom() {

        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("\t\t\tSHOW ROOM");
        System.out.println();

        System.out.print("Enter the name of the customer : ");
        name = sc.nextLine();

        System.out.println();
        System.out.print("Enter the mobile number of the customer : ");
        mobno = sc.nextLong();

        System.out.println();
        System.out.print("Enter the cost of the goods purchased by the customer : ");
        cost = sc.nextDouble();
    }

    void calculate() {

        if (cost <= 10000) {
            
            dis = 0.05 * cost;
        }
        else if (cost > 10000 && cost <= 20000) {
            
            dis = 0.10 * cost;
        }
        else if (cost > 20000 && cost <= 35000) {
            
            dis = 0.15 * cost;
        }
        else if (cost > 35000) {
            
            dis = 0.20 * cost;
        }

        amount = cost - dis;
    }

    void display() {

        System.out.println();
        System.out.println("\tCustomer name\t\t\t\t" + name);
        System.out.println("\tCustomer mobile number\t\t\t" + mobno);
        System.out.println("\tAmount to be paid after discount\t" + amount);
        System.out.println();
    }

    public static void main(String[] args) {
        
        ShowRoom ob = new ShowRoom();

        ob.input();
        ob.calculate();
        ob.display();
    }
}
