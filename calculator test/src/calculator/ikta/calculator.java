package calculator.ikta;

	import java.util.Scanner;
	public class calculator {
	    
	    @SuppressWarnings("resource")
		public static void main(String[] args){
	    
	        int ikta1=0;
	        int ikta2=0;
	        char operator;
	        double answer = 0.0;
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter your first number : ");
	        ikta1 = input.nextInt();
	        System.out.println("Enter your second number : ");
	        ikta2 = input.nextInt();
	        System.out.print("What operation? ");
	        operator = input.next().charAt(0);
	        
	        switch(operator){
	            
	            case '+' : answer = addition(ikta1,ikta2);
	                break;
	            case '-' : answer = subtraction(ikta1,ikta2);
	                break;
	            case '*' : answer = multiplication(ikta1,ikta2);
	                break;
	            case '/' : answer = division(ikta1,ikta2);
	                break;
	        }
	        
	        System.out.println(ikta1+" "+operator+" "+ikta2+" = "+answer);
	        
	        
	}
	    
	    public static int addition(int x,int y){
	        return x+y;
	    }
	    public static int subtraction(int x,int y){
	        return x-y;
	    }
	    public static int multiplication(int x,int y){
	        return x*y;
	    }
	    public static int division(int x,int y){
	        return x/y;
	    }
	}
	


