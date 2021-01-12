package com.testcontinue;

import java.util.Scanner;

public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Enter integer number :- ");;
			int number = input.nextInt();
			int sum =0,i=0;
		
			while (i < number){
				i++;
				if (i == 5) 
					continue;
				sum += i;
			}
			
			System.out.println("The input number is : " +number);
			System.out.println("Summation of siries is : "+sum);
		}while(true);
	}

}
