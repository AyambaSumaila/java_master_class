//	To represent the a credit card

public class CreditCard
{
	private Money balance;		//the current balance
	private Money creditLimit;	//the approved credit limit
	private Person owner;		//the owner of the credit card

	//Constructor creates a credit card for the Person parameter
	//with an approved credit limit of the Money parameter
	//and sets the balance to a Money amount of zero 
	public CreditCard(Person newCardholder, Money limit) 
	{
		owner = newCardholder;
		balance = new Money(0);
		creditLimit = new Money(limit);
	}

	//Accessor method returns the balance
	public Money getBalance()
	{
		return new Money(balance);
	}

	//Accessor method returns the credit limit
	public Money getCreditLimit()
	{
		return new Money(creditLimit);
	}

	//Accessor method returns information about the owner
	public String getPersonals()
	{
		return owner.toString();
	}
	
	//Method to make a charge to the credit card, if
	//the credit limit will not be exceded
	public void charge(Money amount)
	{
		Money temp = new Money(balance.add(amount));
		if(temp.compareTo(creditLimit) > 0)
		{
			System.out.println("Exceeds credit limit");
		}
		else
		{
			balance = temp;
			System.out.println("Charge: " + amount);
		}
	}

	//Method to make a payment to the credit card
	public void payment(Money amount)
	{
		balance = balance.subtract(amount);
		System.out.println("Payment: " + amount);
	}		
}