package inharitance;
public class bankinharitance{
	private double balance;
	private double interest;
	private String name;
	private String an;
	private String openingdate;
	
	public void Account(String name,String an, String openingdate){
		this.name=name;
		this.an=an;
		this.openingdate=openingdate;
		
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public bankinharitance()
	{
		balance = 0;
		interest = 0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAn() {
		return an;
	}
	public void setAn(String an) {
		this.an = an;
	}
	public String getOpeningdate() {
		return openingdate;
	}
	public void setOpeningdate(String openingdate) {
		this.openingdate = openingdate;
	}
	public bankinharitance(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}



