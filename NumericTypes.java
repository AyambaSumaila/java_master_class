//This program demonstrates how numeric types and operators behave in Java

//TASK #2  Add import statement here to use the Scanner class
import java.util.Scanner;
//TASK #2  (Alternate) Add import statment to use JOptionPane class

public class NumericTypes
{
	public static void main (String [] args)
	{
		//TASK #2 Create a Scanner object here (not used for alternate)
		Scanner keyboard = new Scanner (System.in);

		//identifier declarations
		final int NUMBER = 2 ;		// number of scores
		final int SCORE1 = 100;		// first test score
		final int SCORE2 = 95;		// second test score
		final int BOILING_IN_F = 212;  // freezing temperature
		double fToC;				// temperature in celsius
		double average;				// arithmetic average
		String output;				// line of output to print out
		//TASK #2 declare variables used here
		String firstName;			// user's first name
		String lastName;			// user's last name
		String fullName;			// user's full name
		//TASK #3 declare variables used here
		char firstInitial;			// user's first initial
		char lastInitial;			// user's last initial
		//TASK #4 declare variables used here
		double diameter;			// diameter of the sphere
		double radius;				// radius of the sphere
		double volume;				// volume of the sphere

		// Find an arithmetic average
		average = (SCORE1 + SCORE2) / NUMBER;
		output = SCORE1 + " and " + SCORE2 + " have an average of "
				+ average;
		System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
		fToC = 5/(double)9 * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC
			     + " in Celsius.";
		System.out.println(output);
		System.out.println();		// to leave a blank line

		// ADD LINES FOR TASK #2 HERE
		// prompt the user for first name
		System.out.print("Enter your first name:  ");
		// read the user's first name
		firstName = keyboard.nextLine();
		// prompt the user for last name
		System.out.print("Enter your last name:  ");
		// read the user's last name
		lastName = keyboard.nextLine();
		// concatenate the user's first and last names
		fullName = firstName + " " + lastName;
		// print out the user's full name
		System.out.println(fullName);
		System.out.println();		// to leave a blank line

		// ADD LINES FOR TASK #3 HERE
		// get the first character from the user's first name
		firstInitial = firstName.charAt(0);
		// print out the user's initials
		System.out.println(firstInitial);
		// convert the user's full name to all capital letters
		fullName = fullName.toUpperCase();
		// print out the user's full name in all capital letters
		System.out.println(fullName + " has " + fullName.length()
				+ " characters");
		System.out.println();		// to leave a blank line

		// ADD LINES FOR TASK #4 HERE
		// prompt the user for a diameter of a sphere
		System.out.print("Enter the diameter of a sphere:  ");
		// read the diameter
		diameter = keyboard.nextDouble();
		// calculate the radius
		radius = diameter/2;
		// calculate the volume
		volume = 4/(double)3 * Math.PI * Math.pow(radius,3);
		// print out the volume
		System.out.println("The volume of the sphere is " + volume);
	}
}