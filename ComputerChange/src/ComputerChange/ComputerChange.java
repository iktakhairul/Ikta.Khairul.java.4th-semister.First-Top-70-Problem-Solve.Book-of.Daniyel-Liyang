package ComputerChange;

import java.util.Scanner;

public class ComputerChange {
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an amount in double,for example 11.566345 : ");
		double amount=input.nextDouble();
		int remainingAmount=(int)(amount*100);
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		int numberOfPennies=remainingAmount;
		System.out.println("your amount - "+amount+" consists of  :");
		System.out.println("Dollars : "+numberOfOneDollars);
		System.out.println("Quarters : "+numberOfQuarters);
		System.out.println("Dimes : "+numberOfDimes);
		System.out.println("Nickels : "+numberOfNickels);
		System.out.println("Pennies : "+numberOfPennies);
		
		
		
	}
}
