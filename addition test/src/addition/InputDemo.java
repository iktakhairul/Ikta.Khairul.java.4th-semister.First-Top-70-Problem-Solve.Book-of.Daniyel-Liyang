package addition;
import java.util.Scanner;
public class InputDemo {
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scr.nextInt();
		System.out.println("Enter another number : ");
		int b = scr.nextInt();
		int result1 =a+b;
		int result2 =a-b;
		int result3 =a*b;
		int result4 =a/b;
		System.out.println("the result of addition       : "+result1);
		System.out.println("the result of subtraction    : " +result2);
		System.out.println("the result of multiplication : " +result3);
		System.out.println("the result of division       : " +result4);
		
		
}
}

