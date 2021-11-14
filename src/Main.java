package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Scissors=0;
        int Rock=1;
        int Paper=2;
        int PersonPlay;
        int ComputerPlay;

        System.out.println("Please Enter a move note:scissors=0 , rock=1 , paper=2");
        Scanner input=new Scanner(System.in);
        PersonPlay = input.nextInt();
         ComputerPlay=(int)(Math.random()*2);
        System.out.println(ComputerPlay);
    System.out.println("you choose:"+PersonPlay+"\n computer choose"+ ComputerPlay);
    if(PersonPlay == ComputerPlay)
        System.out.println("No winners the game is tie");
    else if((PersonPlay==Scissors && ComputerPlay== Paper) || (PersonPlay==Rock && ComputerPlay== Scissors) || (PersonPlay==Paper && ComputerPlay== Rock))
        System.out.println("You Win!");
    else
        System.out.println("Computer Win! Try again");
    }

}
