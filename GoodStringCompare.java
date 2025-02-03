import java.util.Scanner;

public class GoodStringCompare {
    public static void main(String[] args) {
        //equals() method
        String name, name2, name3;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name:");
        name=userInput.nextLine();


        System.out.println("Enter a name2:");
        name2=userInput.nextLine();

        System.out.println("Enter a name 3:");
        name3=userInput.nextLine();

        if(name.equals(name2))
        {
            System.out.println(name + " and " + name2 + " are equal");
        }
        else{
            System.out.println(name + " and " + name +" are not the same");
        }
        if(name.equals(name3))
        {
            System.out.println(name + " and " + name3 + " are equal");

        }

        else{
            System.out.println(name + " and " + " are not the same");
        }
    }
}
