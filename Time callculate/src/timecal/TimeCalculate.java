package timecal;

import java.util.Scanner;

public class TimeCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("Enter an integer for seconds : ");
		int second =input.nextInt();
		int minutes =second/60;
		int hour = minutes/60;
		int remaining_second = second%60;
		System.out.println(+hour+" hours, " +minutes+ " minutes, "+remaining_second+ " secounds. ");
		
		
		
		
	}

}
