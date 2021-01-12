package testsum;

public class TestSumJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  sum = (float) (0.0);
		for (float i = 0.01f; i <= 1.0f ; i = i + 0.01f)
		{
			sum = (sum + i);
		}
		System.out.println("The sum is : " +sum);
	}

}
