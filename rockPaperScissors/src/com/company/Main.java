package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInpout = new Scanner(System.in);

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int playORleave;
        do {
            System.out.println("Choose your move\n 1: rock\n 2: paper \n 3: scissor");
            int move = userInpout.nextInt();
            int randomMove = (int) ((Math.random() * (4 - 1)) + 1);

            if (move == 1 && randomMove == 3) {
                System.out.println("Your are rock and AI is scissor: YOU WON! ");
            }
            if (move == 1 && randomMove == 2) {
                System.out.println("Your are rock and AI is Paper: YOU LOST! ");
            }
            if (move == 1 && randomMove == 1) {
                System.out.println("Your are Rock and AI is Rock: DRAW! ");
            }
            if (move == 2 && randomMove == 3) {
                System.out.println("Your are Paper and AI is scissor: YOU LOST! ");
            }
            if (move == 2 && randomMove == 2) {
                System.out.println("Your are Paper and AI is Paper: DRAW! ");
            }
            if (move == 2 && randomMove == 1) {
                System.out.println("Your are Paper and AI is Rock: YOU DRAW! ");
            }

            if (move == 3 && randomMove == 3) {
                System.out.println("Your are scissor and AI is scissor: DRAW! ");
            }
            if (move == 3 && randomMove == 2) {
                System.out.println("Your are scissor and AI is Paper: YPU WON! ");
            }
            if (move == 3 && randomMove == 1) {
                System.out.println("Your are scissor and AI is Rock: YOU LOST! ");


            }
            System.out.println("To play again enter 1, To leave enter 0");

            playORleave = userInpout.nextInt();
        } while (playORleave != 0);

    }
}
