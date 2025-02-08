public class PassObject2 {

    public static void main(String[] args) {
        

        Inventory item = new Inventory("Hee", 29);

        System.out.println("The contents of item are:");
        System.out.println("Description: " + item.getDescription() + " Units: " + item.getUnits());
        
        change(item);
        
        System.out.println("");
        System.out.println("Now the contents of item are: ");
        System.out.println("Description: " + item.getDescription() + item.getUnits());


        //
        //
        //
    }
    

    public static void change(Inventory i)
    {
        i.setDescription("Josh");
        i.setUnits(10);
    }
}
