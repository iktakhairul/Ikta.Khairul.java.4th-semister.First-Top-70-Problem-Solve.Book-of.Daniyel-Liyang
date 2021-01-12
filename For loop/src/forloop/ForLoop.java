package forloop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number,sum = 0, count ;
		for(count = 1 ; count <= 5 ; count++){
			System.out.println("Input "+count+": ");
			number =input.nextInt();
			sum += number;
		}
		System.out.println("Sum is   : "+sum);
		System.out.println("Count is : "+count);
	}

}
