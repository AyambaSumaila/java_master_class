public class SavingsAccount extends BankAccount
{
	private double rate = .025;	//annual rate
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double begBal)
	{
		super(name, begBal);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double begBal)
	{
		super(oldAccount, begBal);
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	} 
		
	public void postInterest( )
	{
		//rate is an annual rate, and we only one one month's worth of interest.
		double newBalance = getBalance() * (1 +rate/12);
		setBalance(newBalance);
	}
	
	public String getAccountNumber( )
	{
		return accountNumber;	
	}
}