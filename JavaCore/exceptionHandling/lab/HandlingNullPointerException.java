package exceptionHandling.lab;

import java.util.Scanner;

public class HandlingNullPointerException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter a name such that the first name starts with 'S' and last name starts with 'P' : ");
        String first_name = scanner.next();
        String last_name = scanner.next();

        person.setFirst_name(first_name);
        person.setLast_name(last_name);

        try {
            System.out.println("The name is : " + person.getFirst_name().toUpperCase() + " " + person.getLast_name().toUpperCase());
        } catch (NullPointerException e) {
            System.err.println("Name not entered as per specifications.");
        } finally {
            scanner.close();
        }
    }
}

class Person {

    private String first_name;
    private String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {

        if (first_name.charAt(0) == 'S') {
            this.first_name = first_name;
        } else {
            this.first_name = null;
        }
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {

        if (last_name.charAt(0) == 'P') {
            this.last_name = last_name;
        } else {
            this.last_name = null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
