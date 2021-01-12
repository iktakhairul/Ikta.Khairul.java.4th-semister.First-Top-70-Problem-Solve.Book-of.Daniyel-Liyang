package com.maximum.methodoverlading;

public class MethodoverLoading {
	public static void main(String[] args) {
		
		System.out.println("The maximum number of 3 and 4 is            : "+ Max(3,4));
		System.out.println("The maximum number of 3.0 and 4.5 is        : "+ Max(3.0,4.5));
		System.out.println("The maximum number of 3.0 , 4.4 and 10.4 is : "+ Max(3.0,4.4,10.4));
	
	}
	public static int Max (int num1, int num2){
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
	public static double Max (double num1, double num2){
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
	
	public static double Max (double num1, double num2,double num3){
			return Max(Max(num1, num2), num3);
	}
	
	
	
	

}
