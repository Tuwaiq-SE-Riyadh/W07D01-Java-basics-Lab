package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter Scissors, Rock or Paper: ");
        String user = in.nextLine();

        int rand = (int)(Math.random()*3);

        String game = "";
        if(rand == 0){
            game = "Scissors";
        }else if (rand == 1){
            game = "Rock";
        }else{
            game = "Paper";
        }

        System.out.println("The game move: "+game);

        if((user.equals("Rock") && game.equals("Scissors")) || (user.equals("Scissors") && game.equals("Paper")) || (user.equals("Paper") && game.equals("Rock"))){
              System.out.println("You won");
        }
        else{
            System.out.println("You lost!");
        }
    }
}

