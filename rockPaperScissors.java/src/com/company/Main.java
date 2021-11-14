package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Task1(int userNumber){

        Random rand = new Random();
        int randomNumber = rand.nextInt((2 - 0) + 1) + 0;
        System.out.println("User inter :" + userNumber);
        System.out.println("Machine inter :" + randomNumber);

        // 0 from scissors
        // 1 from rock
        // 2 from paper
        //Scissors beats paper
        //Rock beats scissors
        //Paper beats rock

        if((userNumber == 0 && randomNumber == 2) || (userNumber == 1 && randomNumber == 0) || (userNumber == 2 && randomNumber == 1)){

            System.out.println("User  WIN ");
        }
        else if( userNumber == randomNumber){

            System.out.println("User and Machine Equal");
        }
        else{

            System.out.println("Machine WIN ");
        }


    }

    public static void main(String[] args) {


        System.out.println("enter 0 from scissors");
        System.out.println("enter 1 from rock");
        System.out.println("enter 2 from paper");

        Scanner input = new Scanner(System.in);
        int InputNumber = input.nextInt();
        Main.Task1(InputNumber);



    }
}
