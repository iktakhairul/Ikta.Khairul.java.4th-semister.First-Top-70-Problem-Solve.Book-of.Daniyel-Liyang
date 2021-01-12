package ComputerAreawithconstant;

import java.util.Scanner;

public class ComputerAreawithconstant {
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		final double PI=3.1416;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius=input.nextDouble();
		double area=radius=radius*radius*PI;
		System.out.println("The Area for the circle of radius : "+radius+" is "+area);
		
	}

}
