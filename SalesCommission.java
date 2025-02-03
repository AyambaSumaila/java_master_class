public class SalesCommission {

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getRate() {
        return rate;
    }

    private void setRate() {
        if(sales < 10000)
            rate=0.05;
        else if(sales < 15000)
            rate=0.1;
        else if(sales < 18000)
            rate=0.12;
        else if(sales < 22000)
            rate=0.14;
        else rate=0.16;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    private double sales, rate, commission, advance, pay;

    public SalesCommission(double s, double a)
    {
        sales=s;
        advance=a;
        calculatePay();
    }

    public void calculatePay()
    {
        setRate();
        commission=sales * rate;
        pay=commission - advance;
    }


}
