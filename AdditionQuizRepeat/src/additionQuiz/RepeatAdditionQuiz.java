package additionQuiz;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do{
			int number1 = (int)(Math.random()*10);
			int number2 = (int)(Math.random()*10);
			@SuppressWarnings("resource")
			Scanner input =new Scanner(System.in);
			System.out.print("What is "+number1 + " + "+ number2 +"? : ");
			int answer = input.nextInt();
			while(number1+number2 != answer){
				System.out.println("Wrong Answer, please try again ! \n"+"What is "+number1+" + "+number2+"? : ");
			answer =input.nextInt();
		}
			System.out.println("You got it.");
		}while(true);
	}

}
