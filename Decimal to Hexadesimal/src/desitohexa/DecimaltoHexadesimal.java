package desitohexa;

import java.util.Scanner;

public class DecimaltoHexadesimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
			@SuppressWarnings("resource")
			Scanner input =new Scanner(System.in);
		System.out.print("Enter integer Decimal value : ");
		int Desimal = input.nextInt();
		
		String hex = "";
		
		while(Desimal !=0){
			int hexValue = Desimal % 16;
			
			char hexDigit = (hexValue <= 9 && hexValue >=0) ? (char)(hexValue + '0') : (char)(hexValue -10 + 'A');
			hex =hexDigit + hex;
			Desimal = Desimal / 16;
			
		}
		
		System.out.println("The Hexadecimal number is : " +hex);
		
		}while(true);
	}

}
