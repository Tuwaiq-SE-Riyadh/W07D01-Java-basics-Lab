package com.TuwaiqJava;

import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Number: 0-Rock 1-Paper 2-Scissors");
        int num = scanner.nextInt();

        if(num == number){
            System.out.println("draw, its: "+ number);
        }
        else {
            switch (num) {
                case 0:
                    if (number == 2) {
                        System.out.println("Win, its: "+ number);
                        break;
                    }
                    if (number == 1) {
                        System.out.println("Lose, its: "+ number);
                        break;
                    }
                case 1:
                    if (number == 0) {
                        System.out.println("Win, its: "+ number);
                        break;
                    }
                    if (number == 2) {
                        System.out.println("Lose, its: "+ number);
                        break;
                    }
                case 2:
                    if (number == 1) {
                        System.out.println("Win, its: "+ number);
                        break;
                    }
                    if (number == 0) {
                        System.out.println("Lose, its: "+ number);
                        break;
                    }
            }
        }

    }

}
