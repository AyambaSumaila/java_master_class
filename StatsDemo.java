import java.text.DecimalFormat;	//for number formatting
import java.util.Scanner;			//for keyboard input
import java.io.*;						//for using files

public class StatsDemo
{
	public static void main(String [] args) throws IOException//throws clause
	{
		//create an object of type Decimal Format
		DecimalFormat threeDecimals = new DecimalFormat("0.000");
		//create an object of type Scanner
		Scanner keyboard = new Scanner (System.in);
		String filename;	// the user input file name
				
		//Prompt the user and read in the file name 
		System.out.println("This program calculates statistics on a file containing a series of numbers");
		System.out.print("Enter the file name:  ");
		filename = keyboard.nextLine();

		//Create a FileReader object passing it the filename
		FileReader freader = new FileReader(filename);
		//Create a BufferedReader object passing it the FileReader object.
		BufferedReader input = new BufferedReader(freader);

		double sum = 0;	//the sum of the numbers
		int count= 0;		//the number of numbers added
		double mean;      //the average of the numbers
		double stdDev;		//the standard deviation of the numbers
		String line;		//a line from the file
		
		// priming read to read the first line of the file
		line = input.readLine();
		//loop that continues until you are at the end of the file
		while (line != null)
		{
			//convert the line into a double value and add the value to the sum
			sum += Double.parseDouble(line);
			//increment the counter
			count++;
			//read a new line from the file
			line = input.readLine();
		}
		
		//close the input file
		input.close();
		
		//store the calculated mean		
		mean = sum/count;
		
		//reconnect to the FileReader object passing it the filename
		freader = new FileReader(filename);
		//reconnect to the BufferedReader object passing it the FileReader object.
		input = new BufferedReader(freader);
	
		double difference;//difference between the value and the mean
		sum = 0;				//reinitialize the sum of the numbers
		count= 0;			//reinitialize the number of numbers added

		// priming read to read the first line of the file
		line = input.readLine();
		//loop that continues until you are at the end of the file
		while (line != null)
		{
			//convert the line into a double value and subtract the mean
			difference = Double.parseDouble(line)- mean;
			
			//add the square of the difference to the sum
			sum += Math.pow(difference,2);
			
			//increment the counter
			count++;
			//read a new line from the file
			line = input.readLine();
		}
		
		//close the input file
		input.close();
		
		//store the calculated standard deviation		
		stdDev = Math.sqrt(sum/count);



		//create an object of type FileWriter using “Results.txt”
		FileWriter fwriter = new FileWriter("Results.txt");
		//create an object of PrintWriter passing it the FileWriter object.
		PrintWriter output = new PrintWriter(fwriter);

		//print the results to the output file
		output.println("mean = " + threeDecimals.format(mean));
		output.println("standard deviation = " + threeDecimals.format(stdDev));
		
		//close the output file
		output.close();
	}
}