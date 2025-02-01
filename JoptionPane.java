import javax.swing.*;

public class JoptionPane {
    public static void main(String[] args) {

        String name;
        name=JOptionPane.showInputDialog("Enter your name?");
        //Byte.parseByte, Double.parseDouble
        String userInput;
        int hours;
        double grossPay, payRate;
        name=JOptionPane.showInputDialog("What is your name?");
        userInput=JOptionPane.showInputDialog("How many hours did you work this week?");
        hours=Integer.parseInt(userInput);
        userInput=JOptionPane.showInputDialog("What is your hourly pay rate?");
        payRate=Double.parseDouble(userInput);
        grossPay=hours*payRate;
        JOptionPane.showMessageDialog(null, "Hello " + name + " your gross pay is " + grossPay);
        System.exit(0);

    }

}
