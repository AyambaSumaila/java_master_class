import java.util.Scanner;

public class CellPhoneTest {

    public static void main(String[] args) {

        String testMan, testMod;
        double testPrice;

        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the manufacturer: ");
        testMan=userInput.nextLine();

        System.out.println("Enter the model number: ");
        testMod=userInput.nextLine();

        System.out.println("Enter the price: ");
        testPrice=userInput.nextDouble();
        Cellphone phone= new Cellphone(testMan, testMod, testPrice);
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++ ");

        System.out.println("Manufacturer : " + phone.getManufact());
        System.out.println("Model number : " + phone.getModel());
        System.out.println("Manufacturer : " + phone.getRetailPrice());

    }
}
