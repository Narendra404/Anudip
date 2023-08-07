package Ch6;

public class BankCustomer {

    String acno;
    String atype;
    float amt;

    BankCustomer() {

        acno = null;
        atype = null;
        amt = 0.0F;
    }

    BankCustomer(String acno, String atype, float amt) {

        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    BankCustomer(BankCustomer obj) {

        this.acno = obj.acno;
        this.atype = obj.atype;
        this.amt = obj.amt;
    }

    void display() {

        System.out.println();
        System.out.println("The values of the data members for this object is : ");
        System.out.println("acno : " + acno);
        System.out.println("atype : " + atype);
        System.out.println("amt : " + amt);
        System.out.println();
    }

    public static void main(String[] args) {

        BankCustomer ob1 = new BankCustomer();

        System.out.println("From Default constructor : ");
        ob1.display();

        BankCustomer ob2 = new BankCustomer("123456", "Savings", 50000.0F);

        System.out.println("From Parameterised constructor with values of acno - '123456', atype - 'Savings' and amt - '50000.0F' : ");
        ob2.display();

        BankCustomer ob3 = new BankCustomer(ob2);

        System.out.println("From Copy constructor with coping the object for the Parameterised constructor: ");
        ob3.display();
    }
}