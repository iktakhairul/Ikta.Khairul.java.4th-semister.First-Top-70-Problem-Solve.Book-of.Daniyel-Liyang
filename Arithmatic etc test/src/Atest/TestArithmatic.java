package Atest;

import java.util.Scanner;

public class TestArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number for x : ");
		double x =input.nextDouble();
		System.out.println("Enter number for y : ");
		double y =input.nextDouble();
		System.out.println("Enter number for z : ");
		double z =input.nextDouble();
		//
		System.out.println("(x < y && y < z) is " + (x <y && y <z));
		System.out.println("(x < y || y < z) is " + (x <y || y<z));
		System.out.println("!(x < y)       is " + !(x <y));
		System.out.println("(x + y < z)    is " + (x + y < z));
		System.out.println("(x + y > z)    is " + (x +y > z));
		
		}while(true);
	}

}
