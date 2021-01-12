package FahrenHeit;

import java.util.Scanner;

public class FahrenHeit {
	private static Scanner input;

	public static void main(String[]args) {
		input = new Scanner(System.in);
		System.out.print("Enter a degree in fahrenheit : ");
		double fahrenheit=input.nextDouble();
		double celsius=(5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit \n"+fahrenheit+" is : \n"+celsius+"\n (in celsius) ");
	}

}
