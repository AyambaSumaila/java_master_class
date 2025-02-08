
public class InventoryDemo {
	
	public static void main(String[] args)
	{
		Inventory item, item2, item3;		
		item=new Inventory();
		
		System.out.println("Item 1:");
		System.out.println("Description: " + item.getDescription());
		System.out.println("Units: " + item.getUnits());
		System.out.println();
		
		
		item2=new Inventory("Wood");
		System.out.println("Item 2: ");
		System.out.println("Description " + item2.getDescription());
		System.out.println("Units " + item2.getUnits());
		
		
		item3=new Inventory("Wofe", 2030);
		System.out.println("Item 3: ");
		System.out.println("Description " + item3.getDescription());
		System.out.println("Units " + item3.getUnits());
		
	}

}
