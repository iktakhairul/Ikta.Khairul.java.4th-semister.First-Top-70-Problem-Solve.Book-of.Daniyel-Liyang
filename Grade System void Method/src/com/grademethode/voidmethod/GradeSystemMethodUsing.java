package com.grademethode.voidmethod;

import java.util.Scanner;

public class GradeSystemMethodUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
		System.out.print("Enter your mark : ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		pointGrade(score);
		}while(true);
	}
	
	
	
	public static void pointGrade(double score){
		if (score >= 80) {
			System.out.println("A+");
		}else if (score >= 70) {
			System.out.println('A');
			
		}else if (score >= 60) {
			System.out.println('B');
			
		}else if (score >= 50) {
			System.out.println('C');
			
		}else if (score >= 40) {
			System.out.println('D');
			
		}else if (score >= 33) {
			System.out.println('E');
			
		}else if (score < 33) {
			System.out.println("You are failed in this subject.");
			
		}
	}

}
