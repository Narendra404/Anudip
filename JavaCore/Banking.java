import java.util.*;

class Account {

    private String account_num;
    private float balance;

    Account (String ac_no, float bal) {

        this.account_num = ac_no;
        this.balance = bal;
    }

    // The setter functions are added so as not to invoke the warning to set
    // data members to final
    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void display() {

        System.out.println();
        System.out.println("The Account number is : " + account_num);
        System.out.println("The Account balance is : " + balance);
        System.out.println();
    }

    public float calculateInterest(float rate) {

        return balance * (rate / 100);
    }
}

class SavingsAccount extends Account {

    private float interest_rate;
    private float overdraft_limit;
    SavingsAccount(String ac_no, float bal, float rate, float limit) {

        super(ac_no, bal);
        this.interest_rate = rate;
        this.overdraft_limit = limit;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void setOverdraft_limit(float overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
    }

    public void display() {

        System.out.println();
        System.out.println("\tThe Savings Account");
        super.display();
        System.out.println("The interest rate is : " + interest_rate);
        System.out.println("The overdraft limit is : " + overdraft_limit);
        System.out.println("The interest value is : " + super.calculateInterest(interest_rate));
        System.out.println();
    }

}

class CurrentAccount extends Account {

    private float interest_rate;
    private float overdraft_limit;
    CurrentAccount(String ac_no, float bal, float rate, float limit) {

        super(ac_no, bal);
        this.interest_rate = rate;
        this.overdraft_limit = limit;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void setOverdraft_limit(float overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
    }

    public void display() {

        System.out.println();
        System.out.println("\tThe Current Account");
        super.display();
        System.out.println("The interest rate is : " + interest_rate);
        System.out.println("The overdraft limit is : " + overdraft_limit);
        System.out.println("The interest value is : " + super.calculateInterest(interest_rate));
        System.out.println();
    }
}
public class Banking {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the Account number : " );
        String ac_no = sc.next();
        System.out.print("Enter the type of the Account (Savings / Current) : ");
        String type = sc.next();

        if (type.equals("Savings")) {

            System.out.print("Enter the balance of the Account : ");
            float bal = sc.nextFloat();
            System.out.print("Enter the overdraft limit of the Account : ");
            float lim = sc.nextFloat();
            System.out.print("Enter the interest rate for the Account : ");
            float rate = sc.nextFloat();
            SavingsAccount sa = new SavingsAccount(ac_no, bal, rate, lim);
            sa.display();
        } else if (type.equals("Current")) {

            System.out.print("Enter the balance of the Account : ");
            float bal = sc.nextFloat();
            System.out.print("Enter the overdraft limit of the Account : ");
            float lim = sc.nextFloat();
            System.out.print("Enter the interest rate for the Account : ");
            float rate = sc.nextFloat();
            CurrentAccount ca = new CurrentAccount(ac_no, bal, rate, lim);
            ca.display();
        }
        else {
            System.out.println("Wrong type of Account");
        }
    }
}
