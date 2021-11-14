package com.company;

import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner input =new Scanner(System.in);
        int playerChose = input.nextInt();
        int number =  (int)(Math.random() * 2);
        if(playerChose == number ){
            System.out.println("Draw");
        }
        else if (playerChose == 1 && number == 0){
            System.out.println("Win");
        }
        else if (playerChose == 0 && number == 1){
            System.out.println("Lose");
        }
        else if (playerChose == 2 && number == 1){
            System.out.println("Win");
        }
        else if (playerChose == 1 && number == 2){
            System.out.println("Lose");
        }
        else if (playerChose == 0 && number == 2){
            System.out.println("Win");
        }
        else if (playerChose == 1 && number == 2){
            System.out.println("Lose");
        }
        else{
            System.out.println("Enter Number between 0,1 and 2: ");
            playerChose = input.nextInt();
        }
    }
}
