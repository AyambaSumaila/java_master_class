public class Payroll2 {

    private double hoursWorked;

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    private double payRate;

    //constructor

    public  Payroll2()
    {
        hoursWorked=0.0;
        payRate=0.0;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay()
    {
        double grossPay, overTimePay;
        if(hoursWorked > 40)
        {
            grossPay = 40 * payRate;
            overTimePay=(hoursWorked - 40) * (payRate * 1.5);
            grossPay +=overTimePay;
        }
        else{
            grossPay=payRate * hoursWorked;
        }

        return grossPay;
    }


}
