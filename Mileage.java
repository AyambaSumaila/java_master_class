/**
  This program calculates mileage
  Diane Christie
  August 12, 2005
*/

import java.util.Scanner;

public class Mileage
{
	public static void main (String [] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);

		//declare variables
		double miles;	//miles driven
		double gallons;	//gallons of gas used
		double mileage; // miles per gallon calculated

		//prompt the user and read input
		System.out.println("This program calculates mileage");
		System.out.print("Enter the miles driven:  ");
		miles = keyboard.nextDouble();
		System.out.print("Enter the gallons used:  ");
		gallons = keyboard.nextDouble();

		//calculate MPG = miles/gallons
		mileage = miles/gallons;

		//display results
		System.out.println(mileage + " miles per gallon");
	}
}