package com.greatstcommondivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer number :- ");
		int number1 = input.nextInt();
		System.out.print("Enter secound integer number :- ");
		int number2 = input.nextInt();
		
		
		int gcd = 1,k=2;
		while(k <=number1 && k <=number2){
			if(number1 % k ==0 && number2 % k ==0)
				gcd = k;
			k++;
		}
		System.out.println("The greatest commomdivisor for :- "+ number1+ " and "+number2+ " is :- "+ gcd);
	}

}
