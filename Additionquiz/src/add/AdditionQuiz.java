package add;
import java.util.Scanner;
public class AdditionQuiz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =(int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		 
		Scanner ikta = new Scanner(System.in);
		 System.out.print("What is " +number1 + "+" +number2 + "?");
		 int number =ikta.nextInt();
		System.out.println(number1 + "+" + number2 +"=" + number + " is " +(number1+number2 ==number));
		
	}

}
