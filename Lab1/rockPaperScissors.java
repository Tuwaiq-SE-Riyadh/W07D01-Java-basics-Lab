package Lab1;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("---Welcomwe to rock Paper Scissors Game---");
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		
		System.out.println("Please Enter number from 0 to 2 ");
		System.out.println("(0 is scissors) -- (1 is rock) -- (2 is paper)");
		int choice = scanner.nextInt();
		if(choice == randomNumber){
			System.out.println("draw");
		}else if(choice == 0 && randomNumber == 1){
			System.out.println("You lose");
		}else if(choice == 0 && randomNumber == 2){
			System.out.println("You win");
		}else if(choice == 1 && randomNumber == 0){
			System.out.println("You Win");
		}else if(choice == 1 && randomNumber == 2){
			System.out.println("You lose");
		}else if(choice == 2 && randomNumber == 0){
			System.out.println("You lose");
		}else if(choice == 2 && randomNumber == 1){
			System.out.println("You Win");
		}else {
			System.out.println("sorry! you can only choose from 0 To 2");
		}
		System.out.println("the computer chose: " + randomNumber);
		}

	}


