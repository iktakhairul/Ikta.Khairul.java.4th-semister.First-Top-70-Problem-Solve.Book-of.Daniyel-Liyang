package guessnumberonetime;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess,number;
		do{
		number =(int)(Math.random()* 10);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 10 : ");
		System.out.println("Enter your Guess : ");
		guess = input.nextInt();
		if (guess == number) 
			System.out.println("Yes, The number is "+number);
			else if(guess > number)
				System.out.println("Your Guess is too high,please try again");
				else 
					System.out.println("Your Guess is too low,please ty again");
		
		}while(guess != number);
	}

}
