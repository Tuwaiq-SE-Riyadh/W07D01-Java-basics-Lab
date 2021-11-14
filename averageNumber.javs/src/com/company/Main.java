package com.company;

import java.util.Scanner;

public class Main {

    public static void Task2(){

        int positiveNumber = 0;
        int negativeNumber = 0;
        int totalNumberInput = 0;
        int total = 0;
        int average = 0;
        int inputNumber;
        int coundtion =0;

        Scanner input = new Scanner(System.in);

        while (coundtion == 0){

            System.out.println("enter number");
            inputNumber = input.nextInt();

            totalNumberInput++;
            total = total + inputNumber;

            if(inputNumber >= 0 ){
                positiveNumber++;
            }
            else {
                negativeNumber++;
            }

            System.out.println("enter 0 to continue or any number to stop ");
            coundtion = input.nextInt();

        }

        System.out.println(" Total Number => " + total);
        System.out.println(" Total Number positive => " + positiveNumber);
        System.out.println(" Total Number negative => " + negativeNumber);
        System.out.println(" average Number => " + (total/totalNumberInput));

    }
    public static void main(String[] args) {


        Main.Task2();

    }
}
