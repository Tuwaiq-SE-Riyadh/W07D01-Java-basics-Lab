package com.company;
import java.util.*;

class Grade {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myTestResults[] = {90, 85, 95, 70, 88};
        double avg;
        int sum = 0;
        for (int i = 0; i < myTestResults.length; i++) {

            sum += myTestResults[i];


        }
        avg = sum / 5;
        System.out.println(sum);
        System.out.println(avg);
        if (avg <= 100 && avg >= 80) {
            System.out.println("A");

        } else if (avg <= 79 && avg >= 70) {
            System.out.println("B");
        } else if (avg <= 69 && avg >= 60) {
            System.out.println("c");
        }else if (avg <= 59 && avg >= 50) {
            System.out.println("D");
        }else{
            System.out.println("f");
        }

    }


}



