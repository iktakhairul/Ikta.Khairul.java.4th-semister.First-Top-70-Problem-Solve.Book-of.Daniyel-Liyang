package com.testbreak;

import java.util.Scanner;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Enter integer number :- ");;
			int number = input.nextInt();
			int sum =0,i=1;
		
			while (i <= number){
				sum +=i;
				if (sum >= 100) {
					break;
					}
			}
			System.out.println("The input number is : " +number);
			System.out.println("Summation of siries is : "+sum);
		}while(true);
	}

}
