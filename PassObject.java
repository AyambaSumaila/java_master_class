public class PassObject {
    public static void main(String[] args) throws Exception {
        Inventory item = new Inventory("Rournament", 21);

        displayItem(item);


    }
    public static void displayItem(Inventory i){
        System.out.println("Description: " + i.getDescription());
        System.out.println("Units: " + i.getUnits());

    }




}
