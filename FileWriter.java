import java.util.Scanner;
import java.io.*;
public class FileWriter {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName, friendName;
        int numFriends;

        Scanner userInput=new Scanner(System.in);
        System.out.println("How many friends do you have?");
        numFriends=userInput.nextInt();

        userInput.nextLine();
        System.out.println("Enter the filename:");
        fileName=userInput.nextLine();

        PrintWriter outputFile=new PrintWriter(fileName);




        for(int i=1; i<=numFriends ; i++)
        {
            System.out.println("Enter the name of friend " + " number " + i + ": ");
            friendName=userInput.nextLine();

            outputFile.println(friendName);

        }
        outputFile.close();
    }
}
