package com.TuwaiqJava;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number of integers");
        int num, positive = 0, negative = 0 , total=0;
        do {
            num = scanner.nextInt();
            if(num > 0) {
                positive++;
                total += num;
            }
            if(num < 0){
                negative++;
            }
        }
        while (num != 0);
        System.out.println("positive Numbers: " + positive);
        System.out.println("negative Numbers: " + negative);
        System.out.println("Total: " + total);
        System.out.println("Average : " + (total/positive));

    }
}
