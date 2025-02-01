public class BankAccount2 {

    private double balance;
    private final double interestRate;
    private double interest;

    public BankAccount2(double startBalance, double intRate)
    {
        balance=startBalance;
        interestRate=intRate;
        interest=0.0;
    }

    public void deposit(double amount)
    {
        balance +=amount;
    }
    public void withDraw(double amount)
    {
        balance -=amount;
    }

    public void addInterest()
    {
        interest = balance * interestRate;
        balance +=interest;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getInterest()
    {
        return interest;
    }


}
