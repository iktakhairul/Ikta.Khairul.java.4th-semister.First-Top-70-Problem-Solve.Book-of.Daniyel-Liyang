package computertax;

import java.util.Scanner;

public class ComputerTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("0-single filter,"+"\n"+"1-married jointly or qualifying window(er),"+"\n"+"2-married jointly or household) "+"\n"+"Enter the filling status : ");
		int status =input.nextInt();
		System.out.println("Enter the taxable income :");
		double income =input.nextDouble();
		double tax =0;
		
		if (status == 0) {
			
		if(income <=8350)
			tax = income *0.10;
		else if (income <= 33950) 
			tax=8350*0.10 + (income- 8350) * 0.15;
		else 
			if (income <= 82250) 
				tax=8350 *0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <=171550) 
				tax=8350 *0.10 + (33950 -8350) * 0.15 + (82250 - 33950) * 0.25 +(income -82250) * 0.28;
			else if (income <=372950) 
				tax = 8350 *0.10 +(33950 -8350)* 0.15 + (82250 - 33950) * 0.25 +(171550 -82250) * 0.28 +(income -171550)*0.33;
			else
				tax=8350 *0.10 + (33950 -8350) * 0.15 + (82250 - 33950) * 0.25 +(171559 -82250) * 0.28 +(372950 -171550)*0.33 + (income -372950)* 0.35;
		
		
		
		
		}else if (status == 1){
			if(income <=8350)
				tax = income *0.15;
			else if (income <= 33950) 
				tax=8350*0.10 + (income- 8350) * 0.18;
			else 
				if (income <= 82250) 
					tax=8350 *0.15 + (33950 -8350) * 0.18 + (income - 33950) * 0.30;
				else if (income <=171550) 
					tax=8350 *0.15 + (33950 -8350) * 0.18 + (82250 - 33950) * 0.30 +(income -82250) * 0.33;
				else if (income <=372950) 
					tax = 8350 *0.15 +(33950 -8350)* 0.18 + (82250 - 33950) * 0.30 +(171550 -82250) * 0.33 +(income -171550)*0.35;
				else
					tax=8350 *0.15 + (33950 -8350) * 0.18 + (82250 - 33950) * 0.30 +(171559 -82250) * 0.33 +(372950 -171550)*0.35 + (income -372950)* 0.38;
			
			
			
			
		}else if (status ==2){
			if(income <=8350)
				tax = income *0.18;
			else if (income <= 33950) 
				tax=8350*0.10 + (income- 8350) * 0.20;
			else 
				if (income <= 82250) 
					tax=8350 *0.18 + (33950 -8350) * 0.20 + (income - 33950) * 0.33;
				else if (income <=171550) 
					tax=8350 *0.18 + (33950 -8350) * 0.20 + (82250 - 33950) * 0.33 +(income -82250) * 0.35;
				else if (income <=372950) 
					tax = 8350 *0.18 +(33950 -8350)* 0.20 + (82250 - 33950) * 0.33 +(171550 -82250) * 0.35 +(income -171550)*0.38;
				else
					tax=8350 *0.18 + (33950 -8350) * 0.20 + (82250 - 33950) * 0.33 +(171559 -82250) * 0.35 +(372950 -171550)*0.38 + (income -372950)* 0.40;
		}
			//Display Tax	
		System.out.println("Tax is : " +(int)(tax * 100)/100.0);
		}while(true);
	}

}
