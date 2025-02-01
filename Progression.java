import java.util.Scanner;

public class Progression
{
 	public static void main(String [] args)
 	{
 		Scanner keyboard = new Scanner (System.in);
		System.out.println(
			"This program will calculate the geometric and ");
		System.out.println(
			"harmonic progression for the number you enter.");
		System.out.print(
			"Enter an integer that is greater than or equal to 1:  ");		
		int input = keyboard.nextInt();
		int geomAnswer = geometricRecursive (input);
		double harmAnswer = harmonicRecursive (input);
		System.out.println("Using recursion:");
		System.out.println("The geometric progression of " + input + " is " + geomAnswer);
		System.out.println("The harmonic progression of " + input + " is " + harmAnswer);
		
		geomAnswer = geometricIterative (input);
		harmAnswer = harmonicIterative (input);
		System.out.println("Using iteration:");
		System.out.println("The geometric progression of " + input + " is " + geomAnswer);
		System.out.println("The harmonic progression of " + input + " is " + harmAnswer);
	}
	
	public static int geometricRecursive (int number)
	{
		if (number ==1)
			return 1;
		else 
			return number * geometricRecursive (number - 1);
		
	}

	public static double harmonicRecursive (int number)
	{
		if (number == 1)
			return 1;
		else 
			return 1.0/number * harmonicRecursive (number -1);
	}
	
	public static int geometricIterative (int number)
	{
		int answer = 1;
		while (number > 1)
		{
			answer = answer * number;
			number--;
		}
		return answer;
	}
	
	public static double harmonicIterative (int number)
	{
		double answer = 1;
		while (number > 1)
		{
			answer = answer/number;
			number--;
		}
		return answer;
	}
}