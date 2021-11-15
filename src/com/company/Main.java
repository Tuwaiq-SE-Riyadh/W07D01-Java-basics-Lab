package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String x = in.nextLine();


        int rand = (int) (Math.random() * 3);
        System.out.println(rand);

        String game = "";
        if (rand == 0) {
            game = "scissors";
        } else if (rand == 1) {
            game = "rock";
        } else {
            game = "paper";
        }

        System.out.print("the game move " + game);

     if(x.equals(game)){
         System.out.println("tie");
     }else if (x.equals("paper") && game.equals("rock")||x.equals("scissors")&&game.equals("paper")||x.equals("rock")&&game.equals("scissors")){
         System.out.println("you win");
     }else {
         System.out.println("you lose");
     }
    }}
