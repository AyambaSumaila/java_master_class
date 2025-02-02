/*
*
* for the CellPhone class
CellPhone
- manufact : String
- model : String
- retailPrice : double
+ CellPhone(man : String, mod : String,
price : double);
+ setManufact(man : String) : void
+ setModel(mod : String) : void
+ setRetailPrice(price : double) : void
+ getManufact() : String
+ getModel() : String
+ getRetailPrice() : double
*
*
*
* */


public class Cellphone {

    private String manufact, model;
    private double retailPrice;

    public Cellphone(String man, String mod, double price)
    {
        manufact=man;
        model=mod;
        retailPrice=price;

    }

    public void setManufact(String man)
    {
        manufact=man;
    }
    public void setMod(String mod)
    {
        model=mod;
    }

    public void setRetailPrice(double price)
    {
        retailPrice=price;
    }
    public String getManufact()
    {
        return manufact;
    }

    public String getModel()
    {
        return model;
    }
    public double getRetailPrice()
    {
        return retailPrice;
    }
}
