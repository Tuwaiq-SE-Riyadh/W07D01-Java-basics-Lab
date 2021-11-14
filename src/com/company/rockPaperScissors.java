package com.company;

import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 0=Rock, 1=Paper, 2=Scissors
        int randomNum = (int)(Math.random() * 2);  // 0 to 2 (https://www.w3schools.com/java/java_math.asp)
        System.out.print("Enter 0=Rock, 1=Paper or 2=Scissors :");
        int userInput = sc.nextInt();
        System.out.println("randomNum="+randomNum);
        if(userInput == randomNum)
        {
            System.out.println("draw");
        }
        else {
            if(userInput == 0)
            {
                if(randomNum == 1)
                {
                    System.out.println("lose");
                }
                else {
                    // that mean randomNum = 2
                    System.out.println("win");
                }
            }
            if(userInput == 1)
            {
                if(randomNum == 0)
                {
                    System.out.println("win");
                }
                else {
                    // that mean randomNum = 2
                    System.out.println("lose");
                }
            }
            if(userInput == 2)
            {
                if(randomNum == 0)
                {
                    System.out.println("lose");
                }
                else {
                    // that mean randomNum = 1
                    System.out.println("win");
                }
            }
        }


    }
}
