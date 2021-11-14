package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



            double number;
            double total=0;
            double average;
            int count =0;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Please enter number: ");
                number = sc.nextDouble();
                if( number>0){
                    System.out.println(" the number is positive");
                }else{
                    System.out.println("the number is negativ");
                }
               count ++ ;
                total += number;
                average=total/ (count -1);
            }while (number != 0);

            System.out.println("Total is = " + total  );
            System.out.println("avreg is = " + average );


    }

//        double totol =0;
//        if(number >0  ){
//            System.out.println("postiv");
//        }else {
//
//    }
}