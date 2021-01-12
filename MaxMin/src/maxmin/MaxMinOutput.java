package maxmin;

import java.util.Scanner;

public class MaxMinOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
			@SuppressWarnings("resource")
			Scanner input =new Scanner(System.in);
			int number,max,i=1,min;
			System.out.println("Enter numbers : ");
			number = input.nextInt();
			max =number ;
			min = number;
			while(i<5){
				number =input.nextInt();
				if(number > max)
					max =number;
				if(number < min)
					min =number;
				i++;
			}
			System.out.println("Max is : " +max);
			System.out.println("Min " +min);
			
		}while(true);
	}

}
