import java.text.DecimalFormat;

public class RetailItem {

    private String description;
    private int itemNumber;
    private CostData cost;

    public RetailItem(String desc, int itemNum, double wholeSale, double retail) {

        description = desc;
        itemNumber = itemNum;
        cost = new CostData(wholeSale, retail);

    }

    public String toString() {
        String str;
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        str = "Description: " + description
                + "\nItem number: " + itemNumber
                + "\nWhole Cost: $"
                + dollar.format(cost.wholeSale)
                + "\nRetail Price: $"
                + dollar.format(cost.retail);

        return str;
    }

    private class CostData {
        public double wholeSale, retail;

        public CostData(double w, double r) {
            wholeSale = w;
            retail = r;
        }
    }

}
