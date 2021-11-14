package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main( String[] args)
    {
        int Rock = 0;
        int Paper = 1;
        int Scissors = 2;


        int userChoice;
        int computerChoice; //
        Scanner myScan = new Scanner(System.in);
        Random myRandom = new Random();


        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissors");
        System.out.print( "\nPlease Choice (0,1,2) " );
        userChoice = myScan.nextInt();

        computerChoice = myRandom.nextInt(3);


        System.out.println("\nYou choose : " + computerChoice + "\nComputer choose : "+ userChoice);

        if ( userChoice==computerChoice )
        {

            System.out.println("No Winner,Both choose same");
        }
        else if ( (userChoice==Rock && computerChoice==Scissors ) || (userChoice==Scissors  && computerChoice==Paper) || (userChoice==Paper && computerChoice== Rock) )
        {
            System.out.println("you Wins!");
        }
        else
        {
            System.out.println("Computer WIns!");
        }
    }
}
