package starwithfoorloop;

import java.util.Scanner;

public class StarWithForLoop {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("There are 4 kind of loop programm , Enter input (1-4): ");
		int s = input.nextInt();
		switch (s) {
			case  1: for(int i = 1; i < 5; i++){
						int j=0;
						while(j < i){
							System.out.println(j + " ");
							j++;
						}
			
					}
			break;
		case 2: int i2=0;
			while (i2 < 5){
				for(int j2 = i2; j2 > 1; j2--)
					System.out.println(j2 + "    ");
					System.out.println("****");
					i2++;
				
			}
			break;
		case 3: int i3 = 5;
		while (i3>=1){
			int num3 = 0;
			for(int j3 = 1; j3 <= 1; j3++){
				System.out.println(num3 + "xxx");
					num3 *= 2;
			}
			System.out.println();
			i3--;
			
		}
			break;
		case 4: int i4 =1;
			do{
				int num4 =1;
				for(int j4 = 1; j4 <= i4; j4++){
					System.out.println( num4+"G");
					num4 += 2;
				}
				System.out.println();
				i4++;
			}while( i4 <= 5);
			break;
		
		default: System.out.println("Wrong Input");
		break;
		}
	}while(true);
	
	}
}
