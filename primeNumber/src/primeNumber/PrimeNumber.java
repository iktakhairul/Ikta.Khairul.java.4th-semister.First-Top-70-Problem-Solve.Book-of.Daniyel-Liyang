package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,count=0;
		do {
			System.out.println("Please enter how long do you want to prime number ? : \n");
			 c =scanner.nextInt();
			 System.out.println("............to : \n");
			 d = scanner.nextInt();
			 System.out.println("Primes are: ");
			 for(a=c; a<=d; a++){
				 for(b=2;b<=a;b++){
					 if(a%b==0){
						 break;
					 }
				 }
					 if(a==b){
						 System.out.println("prime : "+a);
						 count = count+1;
					 }
			 }
			 System.out.println("there are total prime numbers :"+count);
		}while(true);
		}

}
