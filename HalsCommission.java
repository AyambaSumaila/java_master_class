import java.util.Scanner;
import java.text.DecimalFormat;
public class HalsCommission {
    public static void main(String[] args) {
        double sales, advancePay;
        DecimalFormat dollar = new DecimalFormat("#, ##0.00");
        DecimalFormat percent = new DecimalFormat("#0%");

        Scanner userInput=new Scanner(System.in);
        System.out.println("This program will display a pay report a salesperson");
        System.out.println("Enter the following information");

        System.out.println("Amount of Sales: $");
        sales=userInput.nextDouble();

        System.out.println("Amount of advanced pay: $");
        advancePay=userInput.nextDouble();

        SalesCommission payInfo=new SalesCommission(sales, advancePay);

        System.out.println("--------------------------------------");
        System.out.println("Sales: $ " + percent.format(payInfo.getSales()));
        System.out.println("Commission rate : $ " + percent.format(payInfo.getRate()));
        System.out.println("Commission : $ " + percent.format(payInfo.getCommission()));
        System.out.println("Advanced pay: $ " + percent.format(payInfo.getAdvance()));
        System.out.println("Remaining pay: $ " + percent.format(payInfo.getPay()));

    }
}
