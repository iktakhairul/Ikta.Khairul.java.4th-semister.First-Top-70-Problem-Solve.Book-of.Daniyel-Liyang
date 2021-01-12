package com.GreteastCommonDivisorusingMethod;

import java.util.Scanner;

public class GreatestCommonDivisorUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int number1 = input.nextInt();
		System.out.print("Enter number2 : ");
		int number2 = input.nextInt();
		
		System.out.println("The Greatest Common Divisor for '"+number1+"'  and '"+ number2 +"' is : "+ gcd(number1, number2));
		}while(true);
		
	}
	public static int gcd( int numb1, int numb2){
		
		int gcd =1;
		int k = 2;
		while (k <= numb1 && k <= numb2) {
			if (numb1 % k ==0 && numb2 % k == 0) {
				gcd = k;
			}
			k++;
		}
		
		return gcd;
	}
	
}
