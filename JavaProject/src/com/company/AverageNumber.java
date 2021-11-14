package com.company;
import java.util.*;
public class AverageNumber {
    public static void main (String [] args ) {
        Scanner read = new Scanner(System.in);
        int numbers[] =new int[100];
        int num = -1;
        int i=0;
        int sum=0;
        int avr=0;
        while (num != 0) {
            System.out.print("Please Enter a number :");
            num = read.nextInt();
            numbers[i] =num;
            i++;
        }

        int p=0, n=0;
        int positive[] = new int[i];
        int negative[] = new int[i];
for (int j=0;j<i; j++) {
    if (numbers[j] != 0 && numbers[j] > 0) {
        positive[p] = numbers[j];
        p++;

    } else {
        if (numbers[j] != 0 && numbers[j] < 0) {
            negative[n] = numbers[j];
            n++;
        }
    }
}
    System.out.print("The positive Number is: ");
    for(int k=0;k<i;k++){
        if (positive[k]!=0)
            System.out.print(" "+positive[k]+" ");
    }

    System.out.print("\nThe negative Number is: ");
    for(int k=0;k<i;k++){
        if (negative[k]!=0)
            System.out.print(" "+negative[k]+" ");
    }


for (int m=0;m<numbers.length;m++){
    if (numbers[m]!=0){
        sum+=numbers[m];
    }

}
        System.out.println("\nSum numbers is: "+sum);
        System.out.println("\nAverage  numbers is: "+sum/(i-1));


    }

}
