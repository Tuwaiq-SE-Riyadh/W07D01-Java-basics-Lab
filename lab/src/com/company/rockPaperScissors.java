package com.company;

import java.util.Scanner;

class Game {

    public static void main(String[] args) {

        double computer = (Math.random() * 3);
        Scanner in = new Scanner(System.in);
        System.out.println("enter  scissors ,Rock,paper");
        String player = in.next();
        String choice = "";
        if (computer == 0) {
            choice = "paper";
        } else if (computer == 1) {
            choice = "scissors";
        } else {
            choice = "Rock";
        }
        System.out.println("the game move" + choice);
        if ((player.equals("Rock") && choice.equals("scissors")) || (player.equals("scissors") && choice.equals("paper")) || (player.equals("paper") && choice.equals("Rock"))) {
            System.out.println("win");
        }
//
        if (player.equals(choice)) {
        } else {
            System.out.println("lose");
        }
//



    }
}
