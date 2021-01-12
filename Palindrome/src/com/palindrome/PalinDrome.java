package com.palindrome;
import java.util.Scanner;
public class PalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s =input.nextLine();
		
		int low =0;
		int high=s.length()-1;
		boolean ispalinDrome = true;
		
		while(low < high){
			
			if(s.charAt(low) != s.charAt(high)){
				ispalinDrome = false;
				break;
			}
			low++;
			high--;
		}
		if (ispalinDrome) {
			System.out.println(s+" is a Palindrome");
			
		}
		else 
			System.out.println(s+" is not a Palindrome");
		}while(true);	
	}

}
