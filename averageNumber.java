package com.company;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("Enter numbers");
        int posCount = 0;
        int negCount = 0;
        int All = 0;
        int n = 0;
        int num = scan.nextInt();
        while(num!=0){
            n++;
            if(num > 0)
                posCount++;
            else
                negCount++;
            All+=num;
            num = scan.nextInt();
        }
        System.out.println("number of negative = "+negCount);
        System.out.println("number of positive = "+posCount);
        System.out.println("Average = "+((double)All/n));

    }
}

