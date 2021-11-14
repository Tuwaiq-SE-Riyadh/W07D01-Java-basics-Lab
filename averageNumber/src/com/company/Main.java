package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInpout = new Scanner(System.in);

        int number;
        int total = 0;
        int avrage;
        int counter = 0;
        int done;
        do {
            System.out.println("enter any number");

            number = userInpout.nextInt();
            total += number;

            System.out.println("If you done enter 0");
            done = userInpout.nextInt();
            ++counter;
        } while (done != 0);
        avrage = total / counter;

        System.out.println("The total is: " + total + "\nThe Avarage is: " + avrage);

    }
}
