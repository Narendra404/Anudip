import java.util.*;

public class Perimeter {

    int calcPerimeter(int l, int b) {
        
        return (2 * (l + b));
    }

    int calcPerimeter(int s) {
        
        return (4 * s);
    }

    float calcPerimeter(float r) {
        
        return (2 * (22 / 7) * r);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Perimeter obj = new Perimeter();

        System.out.println();
        System.out.println("\t\tCalculate Perimeter");
        System.out.println();
        System.out.println("\t\tShape\t\tChoice");
        System.out.println();
        System.out.println("\t\tSquare \t\t1");
        System.out.println("\t\tRectangle \t2");
        System.out.println("\t\tCircle \t\t3");
        System.out.println();
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();
        
        System.out.println();
        switch (ch) {
            
            case 1 :
                System.out.println("Enter the length of the side of the Square : ");
                int a = sc.nextInt();
                System.out.println();
                System.out.println("The Perimeter of the Square is : " + obj.calcPerimeter(a));
                break;

            case 2 :
                System.out.println("Enter the length and breadth of the Rectangle : ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println();
                System.out.println("The Perimeter of the Rectangle is : " + obj.calcPerimeter(l, b));
                break;

            case 3 :
                System.out.println("Enter the length of the radius of the Circle : ");
                float r = sc.nextFloat();
                System.out.println();
                System.out.println("The Perimeter of the Circle is : " + obj.calcPerimeter(r));
                break;

            default:
                System.out.println("Enter the correct choice.");
        }
        System.out.println();
    }
}
