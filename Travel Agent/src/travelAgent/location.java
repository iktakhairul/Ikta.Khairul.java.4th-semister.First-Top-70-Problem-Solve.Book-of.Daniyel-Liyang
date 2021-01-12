package travelAgent;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
public class location {

	Scanner input = new Scanner(System.in);
	public void Dhaka(){
		///enter location name
		System.out.println("There are many visitable place :-  \n"
				+ "1. National Zoo \n"
				+ "2. \n"
				+ "3. \n"
				+ "4. \n"
				+ "5. \n");
		
		System.out.print(" -------:) ");
        int slkey = input.nextInt();
		
        switch (slkey) {
        
        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
        	System.out.println(" Press (0-9) to see Googlemap location ");
        	int chd = input.nextInt();
        	if(chd != (-0)){
        		///enter google map location URL
        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI(url));
                    } catch (IOException | URISyntaxException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else{
                    Runtime runtime = Runtime.getRuntime();
                    try {
                        runtime.exec("xdg-open " + url);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        
        	}else {
				System.out.println("Wrong input!!! input must be +desimal value");
			}
        
        		break;

        		
        		
        		
        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
        	System.out.println(" Press (0-9) to see Googlemap location ");
        	int chd1 = input.nextInt();
        	if(chd1 != (-0)){
        		///enter google map location URL
        		String url1 = "";
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI(url1));
                    } catch (IOException | URISyntaxException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else{
                    Runtime runtime = Runtime.getRuntime();
                    try {
                        runtime.exec("xdg-open " + url1);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                
                }
        	}else {
				System.out.println("Wrong input!!! input must be +desimal value");
			}
        		break;

        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
        	System.out.println(" Press (0-9) to see Googlemap location ");
        	int chd2 = input.nextInt();
        	if(chd2 != (-0)){
        		///enter google map location URL
        		String url2 = "";
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI(url2));
                    } catch (IOException | URISyntaxException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else{
                    Runtime runtime = Runtime.getRuntime();
                    try {
                        runtime.exec("xdg-open " + url2);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        
        	}else {
				System.out.println("Wrong input!!! input must be +desimal value");
			}
	
        		break;

        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
        	System.out.println(" Press (0-9) to see Googlemap location ");
        	int chd3 = input.nextInt();
        	if(chd3 != (-0)){
        		///enter google map location URL
        		String url3 = "";
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI(url3));
                    } catch (IOException | URISyntaxException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else{
                    Runtime runtime = Runtime.getRuntime();
                    try {
                        runtime.exec("xdg-open " + url3);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        	}else {
				System.out.println("Wrong input!!! input must be +desimal value");
			}
        		break;
        		
        		
        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
        	System.out.println(" Press (0-9) to see Googlemap location ");
        	int chd4 = input.nextInt();
        	if(chd4 != (-0)){
        		///enter google map location URL
        		String url4 = "";
                if(Desktop.isDesktopSupported()){
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI(url4));
                    } catch (IOException | URISyntaxException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else{
                    Runtime runtime = Runtime.getRuntime();
                    try {
                        runtime.exec("xdg-open " + url4);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        	}else {
				System.out.println("Wrong input!!! input must be +desimal value");
			}
        	
			break;
		default: System.out.println("Wrong Input!!!");
			break;
		}
		
	}// end Dhaka function
	
	public void Comilla(){
		///enter location name
				System.out.println("There are many visitable place :-  \n"
						+ "1. \n"
						+ "2. \n"
						+ "3. \n"
						+ "4. \n"
						+ "5. \n");
				
				System.out.print(" -------:) ");
		        int slkey = input.nextInt();
				
		        switch (slkey) {
		        
		        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd = input.nextInt();
		        	if(chd != (-0)){
		        		///enter google map location URL
		        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        
		        		break;

		        		
		        		
		        		
		        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd1 = input.nextInt();
		        	if(chd1 != (-0)){
		        		///enter google map location URL
		        		String url1 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url1));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url1);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;

		        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd2 = input.nextInt();
		        	if(chd2 != (-0)){
		        		///enter google map location URL
		        		String url2 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url2));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url2);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
			
		        		break;

		        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd3 = input.nextInt();
		        	if(chd3 != (-0)){
		        		///enter google map location URL
		        		String url3 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url3));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url3);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;
		        		
		        		
		        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd4 = input.nextInt();
		        	if(chd4 != (-0)){
		        		///enter google map location URL
		        		String url4 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url4));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url4);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        	
					break;
				default: System.out.println("Wrong Input!!!");
					break;
				}
	}
	public void Chittagong(){
		///enter location name
				System.out.println("There are many visitable place :-  \n"
						+ "1. \n"
						+ "2. \n"
						+ "3. \n"
						+ "4. \n"
						+ "5. \n");
				
				System.out.print(" -------:) ");
		        int slkey = input.nextInt();
				
		        switch (slkey) {
		        
		        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd = input.nextInt();
		        	if(chd != (-0)){
		        		///enter google map location URL
		        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        
		        		break;

		        		
		        		
		        		
		        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd1 = input.nextInt();
		        	if(chd1 != (-0)){
		        		///enter google map location URL
		        		String url1 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url1));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url1);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;

		        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd2 = input.nextInt();
		        	if(chd2 != (-0)){
		        		///enter google map location URL
		        		String url2 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url2));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url2);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
			
		        		break;

		        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd3 = input.nextInt();
		        	if(chd3 != (-0)){
		        		///enter google map location URL
		        		String url3 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url3));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url3);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;
		        		
		        		
		        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd4 = input.nextInt();
		        	if(chd4 != (-0)){
		        		///enter google map location URL
		        		String url4 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url4));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url4);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        	
					break;
				default: System.out.println("Wrong Input!!!");
					break;
				}
	}
	public void Sylhet(){
		///enter location name
				System.out.println("There are many visitable place :-  \n"
						+ "1. \n"
						+ "2. \n"
						+ "3. \n"
						+ "4. \n"
						+ "5. \n");
				
				System.out.print(" -------:) ");
		        int slkey = input.nextInt();
				
		        switch (slkey) {
		        
		        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd = input.nextInt();
		        	if(chd != (-0)){
		        		///enter google map location URL
		        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        
		        		break;

		        		
		        		
		        		
		        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd1 = input.nextInt();
		        	if(chd1 != (-0)){
		        		///enter google map location URL
		        		String url1 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url1));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url1);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;

		        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd2 = input.nextInt();
		        	if(chd2 != (-0)){
		        		///enter google map location URL
		        		String url2 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url2));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url2);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
			
		        		break;

		        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd3 = input.nextInt();
		        	if(chd3 != (-0)){
		        		///enter google map location URL
		        		String url3 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url3));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url3);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;
		        		
		        		
		        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd4 = input.nextInt();
		        	if(chd4 != (-0)){
		        		///enter google map location URL
		        		String url4 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url4));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url4);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        	
					break;
				default: System.out.println("Wrong Input!!!");
					break;
				}
	}
	public void Rajshahi(){
		///enter location name
				System.out.println("There are many visitable place :-  \n"
						+ "1. \n"
						+ "2. \n"
						+ "3. \n"
						+ "4. \n"
						+ "5. \n");
				
				System.out.print(" -------:) ");
		        int slkey = input.nextInt();
				
		        switch (slkey) {
		        
		        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd = input.nextInt();
		        	if(chd != (-0)){
		        		///enter google map location URL
		        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        
		        		break;

		        		
		        		
		        		
		        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd1 = input.nextInt();
		        	if(chd1 != (-0)){
		        		///enter google map location URL
		        		String url1 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url1));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url1);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;

		        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd2 = input.nextInt();
		        	if(chd2 != (-0)){
		        		///enter google map location URL
		        		String url2 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url2));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url2);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
			
		        		break;

		        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd3 = input.nextInt();
		        	if(chd3 != (-0)){
		        		///enter google map location URL
		        		String url3 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url3));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url3);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;
		        		
		        		
		        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd4 = input.nextInt();
		        	if(chd4 != (-0)){
		        		///enter google map location URL
		        		String url4 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url4));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url4);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        	
					break;
				default: System.out.println("Wrong Input!!!");
					break;
				}
		
	}
	public void Khulna(){
		///enter location name
				System.out.println("There are many visitable place :-  \n"
						+ "1. \n"
						+ "2. \n"
						+ "3. \n"
						+ "4. \n"
						+ "5. \n");
				
				System.out.print(" -------:) ");
		        int slkey = input.nextInt();
				
		        switch (slkey) {
		        
		        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd = input.nextInt();
		        	if(chd != (-0)){
		        		///enter google map location URL
		        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        
		        		break;

		        		
		        		
		        		
		        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd1 = input.nextInt();
		        	if(chd1 != (-0)){
		        		///enter google map location URL
		        		String url1 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url1));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url1);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;

		        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd2 = input.nextInt();
		        	if(chd2 != (-0)){
		        		///enter google map location URL
		        		String url2 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url2));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url2);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
			
		        		break;

		        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd3 = input.nextInt();
		        	if(chd3 != (-0)){
		        		///enter google map location URL
		        		String url3 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url3));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url3);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;
		        		
		        		
		        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd4 = input.nextInt();
		        	if(chd4 != (-0)){
		        		///enter google map location URL
		        		String url4 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url4));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url4);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        	
					break;
				default: System.out.println("Wrong Input!!!");
					break;
				}
		
		}
		public void Barishal(){
		///enter location name
				System.out.println("There are many visitable place :-  \n"
						+ "1. \n"
						+ "2. \n"
						+ "3. \n"
						+ "4. \n"
						+ "5. \n");
				
				System.out.print(" -------:) ");
		        int slkey = input.nextInt();
				
		        switch (slkey) {
		        
		        	case 1: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd = input.nextInt();
		        	if(chd != (-0)){
		        		///enter google map location URL
		        		String url = "https://www.google.com/maps/place/Bangladesh+National+Zoo/@23.8131887,90.3457136,15z/data=!4m2!3m1!1s0x0:0x446e9dc895326a70?sa=X&ved=0ahUKEwi75s3urZfaAhWLKY8KHbazBlQQ_BII_QEwFA";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        
		        		break;

		        		
		        		
		        		
		        	case 2: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd1 = input.nextInt();
		        	if(chd1 != (-0)){
		        		///enter google map location URL
		        		String url1 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url1));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url1);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;

		        	case 3: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd2 = input.nextInt();
		        	if(chd2 != (-0)){
		        		///enter google map location URL
		        		String url2 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url2));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url2);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
			
		        		break;

		        	case 4: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd3 = input.nextInt();
		        	if(chd3 != (-0)){
		        		///enter google map location URL
		        		String url3 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url3));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url3);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        		break;
		        		
		        		
		        	case 5: System.out.println(" Distence from Dhaka Zero point : ");
		        	System.out.println(" Press (0-9) to see Googlemap location ");
		        	int chd4 = input.nextInt();
		        	if(chd4 != (-0)){
		        		///enter google map location URL
		        		String url4 = "";
		                if(Desktop.isDesktopSupported()){
		                    Desktop desktop = Desktop.getDesktop();
		                    try {
		                        desktop.browse(new URI(url4));
		                    } catch (IOException | URISyntaxException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }else{
		                    Runtime runtime = Runtime.getRuntime();
		                    try {
		                        runtime.exec("xdg-open " + url4);
		                    } catch (IOException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		        	}else {
						System.out.println("Wrong input!!! input must be +desimal value");
					}
		        	
					break;
				default: System.out.println("Wrong Input!!!");
					break;
				}
		}
		
}//end class
	
