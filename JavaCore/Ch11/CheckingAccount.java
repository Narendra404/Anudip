package Ch11;

import java.util.*;

interface BankAccount {

    void deposit();
    void withdraw();
}

public class CheckingAccount implements BankAccount {

    int balance;

    @Override
    public void deposit() {

        Scanner sc = new Scanner(System.in);

        int amount;
        System.out.println();
        System.out.print("Enter the amount to be deposited : ");
        amount = sc.nextInt();
        
        balance = balance + amount;

        System.out.println();
        System.out.println("An amount of " + amount + " has been deposited.");
        System.out.println("The balance is : " + balance);
        System.out.println();
    }

    @Override
    public void withdraw() {

        Scanner sc = new Scanner(System.in);

        int amount;
        System.out.print("Enter the amount to be withdrawn : ");
        amount = sc.nextInt();

        balance = balance - amount;

        System.out.println();
        System.out.println("An amount of " + amount + " has been withdrawn.");
        System.out.println("The balance is : " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        
        CheckingAccount obj = new CheckingAccount();

        obj.deposit();
        obj.withdraw();
    }
}
