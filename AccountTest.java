import  java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        BankAccount2 account;
        double balance, interestRate, pay, cashNeeded;
        @SuppressWarnings("resource")
        Scanner userInput=new Scanner(System.in);
        System.out.println("What is your account's " + "starting balance?");
        balance = userInput.nextDouble();
        System.out.println("What is your monthly interest rate?");
        interestRate= userInput.nextDouble();
        account = new BankAccount2(balance,  interestRate);
        System.out.println("How much were you paid this month?");
        pay=userInput.nextDouble();

        System.out.println("We will deposit your pay " + pay + " into your account.");
        account.deposit(pay);
        System.out.println("Your current balance is $ " + account.getBalance());
        System.out.println("How much would you like to like to withdraw?");
        cashNeeded=userInput.nextDouble();
        account.withDraw(cashNeeded);
        account.addInterest();
        System.out.println("This month you have earned $ " + account.getInterest() + " in interest");
        System.out.println("Now your balance is $ " + account.getBalance());

    }
}
