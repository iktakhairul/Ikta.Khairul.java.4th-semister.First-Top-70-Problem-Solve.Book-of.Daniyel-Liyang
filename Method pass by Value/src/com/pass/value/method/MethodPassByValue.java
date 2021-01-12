package com.pass.value.method;
import java.util.Scanner;
public class MethodPassByValue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
	    Scanner input = new Scanner(System.in);
		do{
		System.out.print("Enter number1 : ");
		int Number1 = input.nextInt();
	
		System.out.print("Enter number1 : ");
		int Number2 = input.nextInt();
		swap(Number1, Number2);
		}while(true);
		
	}
	
	
	public static void swap(int num1, int num2) {
		@SuppressWarnings("resource")
	    Scanner input = new Scanner(System.in);
		int temp=0;
		System.out.println("Before swaping, number1 is : "+num1+" number is : "+num2);
		System.out.print("\nWant to swap press 1  : ");
		int swapKey = input.nextInt();
		if (swapKey == 1) {
			
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("\nAfter swaping, number1 is : "+num1+" number2 is : "+num2);
		}else
			System.out.print("WRONG INPUT\n\n");	
	}

}
