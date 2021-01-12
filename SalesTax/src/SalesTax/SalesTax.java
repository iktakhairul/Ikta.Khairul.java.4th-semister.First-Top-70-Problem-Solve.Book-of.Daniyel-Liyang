package SalesTax;

import java.util.Scanner;

public class SalesTax {
	private static Scanner input;

	public static void main(String[]args) {
		input = new Scanner(System.in);
		System.out.print("Enter purchase amount : ");
		double purchasAmount=input.nextDouble();
		double tax =purchasAmount*0.06;
		System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
	
	}

}
