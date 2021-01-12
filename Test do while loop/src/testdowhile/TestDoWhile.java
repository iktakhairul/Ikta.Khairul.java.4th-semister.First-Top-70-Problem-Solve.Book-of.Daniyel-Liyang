package testdowhile;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,sum = 0;
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		do{
			System.out.println("The input ends if it is 0 : ");
			data = input.nextInt();
			sum += data;
		
		}while(data !=0);
		System.out.println("Sum of inputs is : "+sum);
	}

}
