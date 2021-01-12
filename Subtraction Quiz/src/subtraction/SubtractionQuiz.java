package subtraction;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
@SuppressWarnings("unused")
public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_QUISTIONS = 5;
		int correctCount = 0,count = 1,mark =0;
		long startTime = System.currentTimeMillis();
		String output = "";
			
			
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
			
			
		while(count <= NUMBER_OF_QUISTIONS){
				int number1 = (int)(Math.random() * 10);
				int number2 = (int)(Math.random() * 10);
				
				if (number1 < number2) {
					int temp = number1;
					number1 = number2;
					number2 =temp;
				}
				
				System.out.println("What is : "+(number1+ "-"+number2) + " ? : ");
				int answer = input.nextInt();
				
				if (number1 - number2 == answer) {
					System.out.println("***You are Right, try next $");
					mark++;
				}else 
					System.out.println("Wrong answer!, please try again. "+"Answer should be : " + (number1+ " - "+number2) + " = "+(number1 - number2));
				count++;
				output += "\n"+number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " Correct" : " Wrong!");
				System.out.println("\n"+number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " Correct" : " Wrong!"));

				
			}
			long endTime = System.currentTimeMillis();
			long testTime = endTime - startTime;
			System.out.println("Correct count is : " +correctCount +"\n@@@@@@@@@@@@@@@@@@@@@@@@@@\nTest time is : "+testTime/1000+" secounds\n" +output+"\nTotal marks : "+mark+"\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
