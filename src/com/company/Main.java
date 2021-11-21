package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter paper or Scissors or rock");
        String string = scanner.nextLine();
        double any = Math.floor(Math.random() * 3) + 1;
        System.out.println(any);
        String progranm = "";
        if (any == 1) {
            progranm = "paper";
        }
        if (any == 2) {
            progranm = "Scissors";
        }
        if (any == 3) {
            progranm = "rock";
        }
        if (string.equals(progranm)) {
            System.out.println(" equl");
        } else {

            if (string == "Scissors" && any == 1 || string == "rock " && any == 2 || string == "paper" && any == 3) {
                System.out.println("Congratulations you won");
            } else {
                System.out.println("good luck");
            }
        }
    }
}