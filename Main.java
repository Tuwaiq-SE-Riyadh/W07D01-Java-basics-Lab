package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main( String [] args ){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;


        computerChoice = generateComputerChoice( random );
        userChoice = getUserChoice( scanner );
        winner = chooseWinner( computerChoice, userChoice );

        System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
        System.out.println( winner );

    }

    public static String generateComputerChoice( Random  random){


        int number = random.nextInt( 2 ) + 1;
        String computerChoice = "";


        if( number == 0 ){
            computerChoice = "rock";
        }else if( number == 1){
            computerChoice = "paper";
        }else if( number == 2 ){
            computerChoice = "scissors";
        }


        return computerChoice;

    }

    public static String getUserChoice( Scanner scanner ){

        String userWordChoice = "";
        System.out.print( "\nPlease Choice (Rock,scissors,paper) " );
        userWordChoice = scanner.nextLine();
        return userWordChoice;

    }


    public static String chooseWinner( String computerChoice, String userChoice ){

        String winner = "No Winner";
        String customMessage = "Both choose same";
        String finalMessage = "";

        String rockCustomMessage = "The rock beats scissor";
        String scissorsCustomMessage = "Scissors beats paper";
        String paperCustomMessage = "Paper beats rock";



        if( computerChoice.equals( "rock" ) && userChoice.equalsIgnoreCase( "scissors" ) ){
            winner = "Computer";
            customMessage = rockCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "rock" ) && computerChoice.equals( "scissors" ) ){
            winner = "User";
            customMessage = rockCustomMessage;
        }

        if( computerChoice.equals( "scissors" ) && userChoice.equalsIgnoreCase( "paper" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "scissors" ) && computerChoice.equals( "paper" ) ){
            winner = "User";
            customMessage = scissorsCustomMessage;
        }

        if( computerChoice.equals( "paper" ) && userChoice.equalsIgnoreCase( "rock" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userChoice.equalsIgnoreCase( "paper" ) && computerChoice.equals( "rock" ) ){
            winner = "User";
            customMessage = paperCustomMessage;
        }


        finalMessage = winner + " won ( " + customMessage + " )";


        return finalMessage;

    }

}