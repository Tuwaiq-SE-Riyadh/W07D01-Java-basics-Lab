package com.company;

import java.util.Scanner;

public class averageNumber {

    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int number = 0;
        Scanner input =new Scanner(System.in);

        boolean counter = true;
        while (counter == true) {
            int playerChose = input.nextInt();
            number = number + playerChose;
            if(playerChose == 0){
                counter = false;
            }
        }
        System.out.println("Total = "+number);
        number = number / 2;
        System.out.println("Average of Numbers= "+number);
    }
}
