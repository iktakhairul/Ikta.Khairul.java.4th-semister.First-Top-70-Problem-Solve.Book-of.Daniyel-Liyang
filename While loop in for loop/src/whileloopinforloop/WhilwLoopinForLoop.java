package whileloopinforloop;

public class WhilwLoopinForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0,sum = 0;
		for(int i = 0; i< 10; i++){
			sum +=i;
			if(i<j)
				System.out.println(i);
			else
				System.out.println(j);
			while(j<10){
				j++;
			}
			do{
				j++;
			}while(j<10);
		}
		System.out.println("sum : "+sum);
	}
}

