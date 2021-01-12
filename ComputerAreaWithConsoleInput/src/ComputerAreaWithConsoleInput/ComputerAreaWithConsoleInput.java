package ComputerAreaWithConsoleInput;

import java.util.Scanner;

public class ComputerAreaWithConsoleInput {

	public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner	input = new Scanner(System. in);
		System.out.print("enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius*radius*3.1416;
		System.out.println("the area for the circle of radius:\n"+radius+"\nis:\n"+area);
		
		
		
	
	}


}
