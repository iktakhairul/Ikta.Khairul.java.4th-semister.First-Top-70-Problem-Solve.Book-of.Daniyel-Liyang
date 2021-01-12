package com.primenumber.usingmethod;
import java.util.Scanner;
public class PrimeNumberGenarator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			@SuppressWarnings("resource")
			Scanner input =new Scanner(System.in);
			System.out.print("Enter Start number1 : ");
			int enterNumber= input.nextInt();
			System.out.print("                  To : ");
			int enterTo = input.nextInt();
			int prime =enterNumber;
			
			
			if (enterNumber > enterTo ) {
				System.out.println("Distanation Number is Greater Then First number. Enter 1 for Swap");
				int key = input.nextInt();
				if(key == 1){
					int temp = 0 ;
					temp = enterNumber;
					enterNumber = enterTo;
					enterTo = temp;
					prime = enterNumber;
					System.out.println("'now start number is' : "+ enterNumber+ "  and 'To : "+ enterTo);
				}else{
					System.out.println("Wrong input!!!");
				}
			}
			
			
			if (enterTo < 0 || enterNumber < 0 ) {
				System.out.println("Please enter posetive integer number, answer maybe Wrong !!!\n");
			}
			
			
			if(enterNumber < 2){
				enterNumber++;
				if (enterNumber == 1) 
					enterNumber++;
				prime = enterNumber;
			}
			
			
			printprimeNumber(enterNumber, enterTo);
			isprime(prime);
			
			
			}while(true);
			
		}
	
	
	
	
	
	
		public static void printprimeNumber( int prime, int enterTo){
			int  primeperLine = 10;
			int count =0;
			int stop = enterTo;
			while( count < enterTo){
				if(isprime(prime)){
					count++;
					
					
					if (count % primeperLine == 0){ 
						System.out.printf("%5d\n", prime);
					}else{
						System.out.printf("%5d", prime);
					}	
				}
				//if (prime > enterTo) {
				//	break;
				//}
				prime++;
				if (prime > stop) {
					break;
					
				}
			}
			System.out.println("\n\nThere are total "+ count+ " prime numbers");
			
		}

		
		
		
		
		
		
		public static boolean isprime (int prime){
			for(int divisor = 2; divisor <= prime / 2; divisor++){
				if (prime % divisor == 0)
					return false;
			}
			return true;
			
		}

}
