import java.util.Scanner;

public class StringCompareTo {

    public static void main(String[] args) {
        //compareTo() method
        String name, name2;
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter a name");
        name=userInput.nextLine();

        System.out.println("Enter a name 2");
        name2=userInput.nextLine();

        if(name.compareTo(name2) < 0)
        {
            System.out.println(name + " is less than " + name2);
        }
        else if(name.compareTo(name2) == 0)
        {
            System.out.println(name + " is equal to" + name2);
        }
        else if(name.compareTo(name2) > 0)
        {
            System.out.println(name + " is greater than " + name2);
        }
    }
}
