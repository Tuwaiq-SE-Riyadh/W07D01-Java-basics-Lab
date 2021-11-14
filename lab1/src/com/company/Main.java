package com.company;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

//        Task1
        int randomNumber= (int) (Math.random()*3);
        String play="";
        if(randomNumber==0){
          play="scissors";
        }
        if(randomNumber==1){
            play="rock";
        }
        if(randomNumber==2){
            play="paper";
        }
        System.out.println( play);
        System.out.println("Enter number for starting 0 for scissors or 1 for rock or 2 for papre");
        Scanner scanner = new Scanner(System.in);
        int userNumber=scanner.nextInt();
        if(play=="scissors"){
            if(userNumber==2){
                System.out.println("Scissors beats paper \n you are lose");
            }else{
                if(userNumber==1){
                    System.out.println("Rock beats scissors \n you are win");
                }else{
                    System.out.println(" draw");
                }
            }
        }

        if(play=="rock"){
            if(userNumber==2){
                System.out.println("Paper beats rock \n you are win");
            }else{
                if(userNumber==0){
                    System.out.println("Rock beats scissors \n you are lose");
                }else{
                    System.out.println(" draw");
                }
            }
        }
        if(play=="paper"){
            if(userNumber==0){
                System.out.println("Scissors beats paper \n you are win");
            }else{
                if(userNumber==1){
                    System.out.println("Paper beats rock \n you are lose");
                }else{
                    System.out.println(" draw");
                }
            }
        }




//        Task2
        System.out.println("Enter numbers and enter zero when finished ");
        int userInput;
        int counter=0;
        int sum=0;
        int i=1;
        while (i>0){
            Scanner input = new Scanner(System.in);
            userInput =input.nextInt();
            if(userInput>0){
                System.out.println(""+userInput+" is positive number");
                sum+=userInput;
                counter+=1;
            }else {
                if(userInput<0){
                    System.out.println(""+userInput+" is negative number");
                    sum+=userInput;
                    counter+=1;
                }else {
                    System.out.println("The total is" + sum);
                    double avrage = sum/counter;
                    System.out.println("The avrage is " + avrage);
                    i = -1;
                }
            }

        }
    }

}
