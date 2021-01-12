package inharitance;

public class bank extends bankinharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankinharitance ac = new bankinharitance();
		ac.setName("Shah Md. Iktakhairul Islam");
		ac.setAn("171-15-8606");
		ac.setOpeningdate("01-01-2018");
		
		bankinharitance Savings = new bankinharitance(10000, 0.10);
		Savings.withdraw(200);
		Savings.deposit(500);
		Savings.addInterest();
		System.out.println("name:"+ac.getName()+"\n"+"number : " +ac.getAn()+"\n"+"date"+ac.getOpeningdate());
		System.out.println(Savings.getBalance());
		System.out.println("Expected: 10000.0");

	}

}
