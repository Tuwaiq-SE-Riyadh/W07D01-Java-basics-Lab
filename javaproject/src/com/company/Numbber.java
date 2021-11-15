package com.company;
import java.util.*;
class Avrege{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, total = 0, count = 0;
        int number;
        double average;

        System.out.println("Enter the number: ");
        do { number = input.nextInt();
            total += number;
            count++;
            if(number > 0){
                positive++;
            }
            else if(number < 0){
                negative--;
            }
        }
        while(number != 0);

        average = total / count;

        System.out.println("The number of positives is "+ positive);
        System.out.println("The number of negatives is "+ negative);
        System.out.println("The total is "+ total);
        System.out.println("The average is "+ average);

    }
}




