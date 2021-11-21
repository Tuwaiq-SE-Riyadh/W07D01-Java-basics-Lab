package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int number;

        while(true){
            number  = in.nextInt();
            if(number == 0)
                break;
            else if(number > 0){
                pos++;

            }
            else if(number < 0)
                neg++;
        }

        int average = pos+neg;
        System.out.println("Positive numbers: "+pos+"\n And negative numbers: "+neg+"\n The average: "+average);

    }
}
