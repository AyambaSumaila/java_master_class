import java.util.Scanner;

public class GrossPay {

    public static void main(String[] args) {
        double hours, rate;
        Scanner userInput =new Scanner(System.in);
        Payroll2 employee =new Payroll2();
        System.out.println("How many hours did the employee work?");
        hours=userInput.nextDouble();

        System.out.println("What is the employee's hourly pay rate ?");
        rate=userInput.nextDouble();

        employee.setHoursWorked(hours);
        employee.setPayRate(rate);
        System.out.println("The employee's gross pay is $" + employee.getGrossPay());

    }
}
