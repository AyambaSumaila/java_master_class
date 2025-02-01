public class CheckingAccount extends BankAccount
{
	private static double FEE = .15;
	
	public CheckingAccount(String name, double begBal)
	{
		super(name, begBal);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	public boolean withdraw (double amount)
	{
		amount = amount + FEE;
		return super.withdraw(amount);
	}
}