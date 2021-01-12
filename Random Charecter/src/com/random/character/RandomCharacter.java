package com.random.character;
public class RandomCharacter {
	public static void main(String[] arg){
		
		final int Numberofchars = 175;
		final int Charprline = 25;
		
		for(int i = 0; i < Numberofchars ; i++){
			char ch = RandomCharacter.getRandomCharecter();
			
			
			if((i +1 ) % Charprline == 0)
				System.out.println(" "+ch);
			else
				System.out.printf("%2c",ch);			
		}	
	}

	private static char getRandomLowerCaseLetter(char a, char z) {
		// TODO Auto-generated method stub
		return (char) (a + Math.random() * (z -a) +1);
	}	
	
	
	public static char getRandomCharecter(){
		
		
		return getRandomLowerCaseLetter('a', 'z');
	}
}
