package Misc;

import java.util.Scanner;

public class Balls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter the number of balls to be distributed : ");
        int number_of_balls = sc.nextInt();
        System.out.println("Enter the number of players to which the balls are to be distributed : ");
        int number_of_players = sc.nextInt();

        System.out.println("The number of balls each player got is : " + (number_of_balls / number_of_players));
        System.out.println("The number of balls left after distribution : " + (number_of_balls % number_of_players));
        System.out.println();
    }
}