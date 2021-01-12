package lottery;

import java.util.Scanner;

public class LotteryUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String lottery = ""+(int)(Math.random() * 10) + (int)(Math.random() * 10);
			 System.out.println("Enter your lottery pick (Two Digits) : ");
			 String guess = input.nextLine();
			 
			 int lotteryDigit1 = lottery.charAt(0);
			 int lotteryDigit2 = lottery.charAt(1);
			 int guessDigit1 = guess.charAt(0);
			 int guessDigit2 = guess.charAt(1);
			 
			 System.out.println("The Lottery number is : " + lottery);
			 
			 if (guess == lottery) 
				System.out.println("Exact match :----------------------You win $10,000");
			 
			else if (guessDigit2 == lotteryDigit1 
					&& guessDigit1 == lotteryDigit2) 
				System.out.println("Match all Digits :----------------- you win $3,000");
			 
			else if (guessDigit1 == lotteryDigit1 
					||guessDigit1 == lotteryDigit2
					||guessDigit2 == lotteryDigit1
					||guessDigit2 == lotteryDigit1)
						
				System.out.println("Match one Digit :-------------------you win $1,000");		
			else 
				System.out.println("Sorry, no match, please try again !! Good Luck!!");
			}while(true);

	}

}
