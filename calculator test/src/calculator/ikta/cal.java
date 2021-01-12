package calculator.ikta;

	import java.util.Scanner;

	public class cal{

	    @SuppressWarnings("resource")
		public static void main(String[] args){
	        int ikta1=0;
	        int ikta2=0;
	        char operator;
	        double answer = 0.0;
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter your first number : ");
	        ikta1 = input.nextInt();
	        System.out.print("Enter your second number : ");
	        ikta2 = input.nextInt();
	        System.out.print("What operation? ");
	        operator = input.next().charAt(0);
	        
	        switch(operator){
	            
	            case '+' : answer = ikta1 + ikta2;
	                break;
	                
	            case '-' : answer = ikta1 - ikta2;
	                break;
	                
	            case '*' : answer = ikta1 * ikta2;
	                break;
	                
	            case '/' : answer = ikta1 / ikta2;
	                break;
	        }
	        
	        System.out.println(ikta1+" "+operator+" "+ikta2+" = "+answer);
	    }
	    
	    
	    }

