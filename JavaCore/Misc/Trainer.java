package Misc;

import Ch8.EmployeeClass;

import java.util.Scanner;

public class Trainer extends EmployeeClass {

    int tid;
    float bonus;

    void trainerInput() {

        Scanner sc = new Scanner(System.in);

        input();

        System.out.println();
        System.out.print("Enter the trainer ID : ");
        tid = sc.nextInt();
        System.out.print("Enter the amount of bonus for trainer : ");
        bonus = sc.nextFloat();
    }

    void trainerDisplay() {

        display();

        System.out.println();
        System.out.println("The trainer's ID : " + tid);
        float res = getAmountAfterTax() + bonus;
        System.out.println("The trainer's salary after tax deduction and bonus inclusion : " + res);
    }

    public static void main(String[] args) {

        Trainer t = new Trainer();
        t.trainerInput();
        t.trainerDisplay();
    }
}
