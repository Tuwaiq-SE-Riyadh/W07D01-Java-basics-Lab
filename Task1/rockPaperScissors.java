package com.company;
import  java.util.*;

public class rockPaperScissors {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int Num = rand.nextInt((2) + 1);
        System.out.println("Enter Scissors=0, Rock=1 or Paper=2");
        int input = in.nextInt();

        if (input == Num) {
            System.out.println("****** Draw ******");
        }else {

        if (input == 0 && Num == 2 || input == 1 && Num == 0 || input == 2 && Num == 1) {
            System.out.println("****** Win ******");
        } else {
            System.out.println("****** Lose  ******");
        }
    }
        System.out.println(Num);
    }}

