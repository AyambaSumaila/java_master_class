import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String name; int hours; double payRate, grossPay;

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("What is your name?");
            name=userInput.nextLine();

            System.out.println("How many hours did you work this week?");
            hours=userInput.nextInt();

            System.out.println("What is your hourly pay rate?");
            payRate=userInput.nextDouble();
        }
        grossPay=hours*payRate;
        System.out.println("Your gross pay for this week is: $" + grossPay);
        
    }
}
