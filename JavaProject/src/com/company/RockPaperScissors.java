package com.company;
import java.util.*;
public class RockPaperScissors {
    public static void main (String [] args){
        String str="",str2="";

        Scanner read=new Scanner (System.in);
        double num =Math.random()*3;
        System.out.print("Enter the number 0 ,1 or 2:");
        int number=read.nextInt();
        System.out.println("The Random Number is: "+(int)num);


if(number!=0 &&number!=1&&number!=2){
    System.out.println("your number is not equal 1 , 2 or 3 !");
}else {
    if (number == (int) num) {
        System.out.println("you draw");
    } else {
        if (number > (int) num)
            System.out.println("you win");
        else if (number < (int) num)
            System.out.println("you lose");
    }
}
    }
}
