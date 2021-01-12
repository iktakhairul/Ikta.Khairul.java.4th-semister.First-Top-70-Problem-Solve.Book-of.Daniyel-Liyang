package ComputerBmi;

import java.util.Scanner;

public class ComputerInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter weight in pounds :");
		double weight = input.nextDouble();
		System.out.println("Enter height in inches : ");
		double height = input.nextDouble();
		final double KILLOGRAM_PER_POUND = 0.45359237;
		final double METTER_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILLOGRAM_PER_POUND;
		double heightInMeters = height * METTER_PER_INCH;
		double bmi = weightInKilograms/(heightInMeters *heightInMeters);
		
		System.out.println("BMI is : "+bmi);
		if (bmi<18.5) {
			System.out.println("Under weight");
		}
		else 
			if (bmi< 25) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Over weight");
		}
		}
		while(true);
		
		
	}

}
