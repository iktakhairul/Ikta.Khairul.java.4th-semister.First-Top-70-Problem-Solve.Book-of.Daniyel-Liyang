package ComputerAverage;

import java.util.Scanner;



public class ComputerAverage {

	@SuppressWarnings("unused")
	private static int number1;
	@SuppressWarnings("unused")
	private static int number2;
	@SuppressWarnings("unused")
	private static int number3;
	@SuppressWarnings("unused")
	private static double average;

	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three numbers : ");
				double number1=input.nextDouble();
				double number2=input.nextDouble();
				double number3 =input.nextDouble();
                double average=((number1+number2+number3)/3);
				System.out.println("The Average of "+number1+" "+number2+" "+number2+" is : "+average);
		
	}

}
