package Lab1;

import java.util.Scanner;

public class averageNumber 
{

	public static void main(String[] args) 
	{
		int total = 0, avarage = 0, positive = 0 , nigative = 0;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter integer numbers: (split them with space)");
		String s = scanner.nextLine();
		System.out.println("you Entered: " + s);
		String[] str = s.split("\\s+");

		for(int i=0; i<str.length; i++){
			int x = Integer.parseInt(str[i]);
			if(x > 0){
				positive++;
			}else if(x < 0){
				nigative++;
			}
			total += x;
		}
		avarage = total / str.length;
		System.out.println("Total = " + total);
		System.out.println("Avarage = " + avarage);
		System.out.println("Positive Numbers = " + positive);
		System.out.println("Nigative Numbers = " + nigative);
	}

}
