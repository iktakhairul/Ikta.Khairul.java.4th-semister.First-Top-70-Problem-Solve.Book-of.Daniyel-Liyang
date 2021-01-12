package ordertwocities;

import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First City");
		String city1 = input.nextLine();
		System.out.println("Enter Secound City");
		String city2 = input.nextLine();
			
			
		if (city1.compareTo(city2) < 0 ) {
			System.out.println("The cities in alphabatical order are : " + city1 + " ," +city2);
		}else {
			System.out.println("The cities in alphabetical order are : " + city2 +" ," +city1);
		}
		
		}while(true);
		
	}

}
