package travelAgent;
import java.util.Scanner;

public class TravelMain {

	public static void main(String[] args) {
		
		 
      ///main code
        System.out.println(" ------------------ Wellcome To Bangladesh -------------------");
        @SuppressWarnings("resource")
		Scanner inputm = new Scanner(System.in);
        do{
        System.out.println("Enter city name where do you want to go : ");
        System.out.println("1. Dhaka.\n"
        		+ "2. Comilla.\n"
        		+ "3. Chittagong.\n"
        		+ "4. Sylhet.\n"
        		+ "5. Rajshahi."
        		+ "6. Khulna.\n"
        		+ "7. Barishal.\n");
        System.out.print(" -------:) ");
        int skey = inputm.nextInt();

        
        System.out.println(skey);
        
      //create object
        location objlocation = new location();
        //use switch 
        
        switch (skey) {
        
		case 1: System.out.println("     Wellcome to Dhaka");
			objlocation.Dhaka();
			break;

		case 2: System.out.println("     Wellcome to Comilla");
		objlocation.Comilla();
			
			break;

		case 3: System.out.println("    Wellcome to Chittagong");
		objlocation.Chittagong();
	
			break;

		case 4: System.out.println("     Wellcome to Sylhet");
		objlocation.Sylhet();
	
			break;
			
		case 5: System.out.println("     Wellcome to Rajshahi");
		objlocation.Rajshahi();
			
			break;
			
		case 6: System.out.println("     Wellcome to Khulna");
		objlocation.Khulna();
		
		break;
		
		case 7: System.out.println("     Wellcome to Barishal");
		objlocation.Barishal();
		
		break;

		default: System.out.println("     Wrong Input!!!");
			break;
		}
        }while(true);
           
    }
	
}
