import java.util.Scanner;
public class Loan{

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter the annual interest rate: ");
            double annualInterestRate = scanner.nextDouble();
            System.out.print("Enter the number of years: ");
            int numberOfYears = scanner.nextInt();

            double monthlyInterestRate = annualInterestRate / 12;
            double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfYears * 12));

            System.out.printf("Monthly payment: $%.2f%n", monthlyPayment);
        }
    }
}