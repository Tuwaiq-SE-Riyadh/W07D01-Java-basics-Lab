package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class averageNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int stop = 1;
        while (true){
            System.out.println("Enter integer number or enter 0 to exit");
            int temp = in.nextInt();
            if(temp == 0 ){break;}
            arr.add(temp);


        }
        int sumP = 0;
        int sumN = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) > 0){sumP ++;}
            else {sumN ++;}
        }
        System.out.println("Positive :"+sumP);
        System.out.println("Negative :"+sumN);

        System.out.println(arr.toString());

        int sum = 0 ;
        for(int i = 0 ; i < arr.size() ; i++){
            sum += arr.get(i);

        }
        System.out.println("Sum ="+ sum);
        System.out.println("Avg ="+ (sum/arr.size()));

    }
    }
