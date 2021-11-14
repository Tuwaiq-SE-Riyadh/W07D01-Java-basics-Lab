package com.company;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput ;
        int count = 0;
        int total = 0 ;
        while (true)
        {
            System.out.print("Enter any integer number or 0 to end:");
            userInput = sc.nextInt();
            if(userInput == 0)
            {
                break;
            }
            else {
                count ++;
                total= total+userInput;
            }
        }
        System.out.println("----------");
        System.out.println("Total Enters: "+ count);
        System.out.println("Average: "+ (double) total/count);

    }
}
