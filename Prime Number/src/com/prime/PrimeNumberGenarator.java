package com.prime;

import java.util.Scanner;

public class PrimeNumberGenarator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Start Number : ");
		int enterNumber = input.nextInt();
		System.out.print("                to : ");
		int enterTo = input.nextInt();
		int  count = 1,primeNumber =0, perprimeNumberLine = 10;
		
		
		
		if (enterNumber > enterTo ) {
			System.out.println("Distanation Number is Greater Then First number. Enter 1 for Swap");
			int key = input.nextInt();
			if(key == 1){
				int temp = 0 ;
				temp = enterNumber;
				enterNumber = enterTo;
				enterTo = temp;
				primeNumber = enterNumber;
				System.out.println("'now start number is' : "+ enterNumber+ "  and 'To : "+ enterTo);
			}else{
				System.out.println("Wrong input!!!");
			}
		}
		
		
		
		
		
		if (enterNumber < 2){ //0,1,2 processing
			enterNumber++;
				if(enterNumber == 1)
					enterNumber++;
				
			//primeNumber = enterNumber;
		}
		
		primeNumber = enterNumber;
		
		
		
		if (enterTo < 0 || enterNumber < 0 ) {
			System.out.println("Please enter posetive integer number, answer maybe Wrong !!!\n");
		}
		
		
		
		
		
		
		
		while(count < enterTo){//****************
			boolean isPrime = true;
			
			
			
			for(int divisor = 2; divisor <= primeNumber / 2  ; divisor++){//****genarate primenumber
				
				
				if (primeNumber % divisor == 0) {//***if isPrime = false then, print prime number
					isPrime = false;
					break;
					
				}	
			}//****
			
			
			
			if (enterTo > 0 && enterNumber > 0 &&  enterNumber <= enterTo ) {
		
			if(isPrime){//***print number and count = total printable prime numbers
				count++;
			if (count % perprimeNumberLine == 0) {
				System.out.printf("%5d  \n",primeNumber);//new line with last prime of this line
			   
			}
			else
				System.out.printf("%5d  ",primeNumber);
			}
			//***
			}
			primeNumber++;
			
			
			
			if (primeNumber == enterTo + 1 ) {//to which prime 
				break;
			}
			
			
				
		}//wile 2nd **********
		
		System.out.print("\n\n");
		System.out.println("There are "+ (count - 1 )+" Prime Numbers. !!! by Ikta-khairul\n");
		}while(true);// wile 1stclosed
	}

}
