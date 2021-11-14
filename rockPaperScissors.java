package com.company;

import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 3);
        System.out.println("Enter 0 for scissors, 1 for rock and 2 for paper");
        int userEnter = scan.nextInt();
        System.out.println("random = "+randomNum);
        if(userEnter == 0){
            if(randomNum == 0)
                System.out.println("draw");

            else if(randomNum == 1)
                System.out.println("lose");
            else
                System.out.println("win");
        }
        else if(userEnter == 1){
            if(randomNum == 1)
                System.out.println("draw");

            else if(randomNum == 0)
                System.out.println("win");
            else
                System.out.println("lose");
        }
        else if(userEnter == 2){
            if(randomNum == 2)
                System.out.println("draw");

            else if(randomNum == 1)
                System.out.println("win");
            else
                System.out.println("lose");
        }

    }
}
