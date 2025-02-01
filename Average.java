import java.util.Scanner;

public class Average
{
	private int [] data;
	private double mean;
	
	public Average ()
	{
		data = new int [5];
		Scanner keyboard = new Scanner (System.in);
		
		for (int i = 0; i < data.length; i++)
		{
			System.out.print("Enter score number " + (i+1) + ":  ");
			data[i] = keyboard.nextInt();
		}
		
		selectionSort();
		calculateMean();
	}
	
	public void selectionSort()
	{
		int maxIndex;
		int maxValue;
		
		for (int startScan = 0; startScan < data.length-1; startScan++)
		{
			maxIndex = startScan;
			maxValue = data[startScan];
			for (int index = startScan + 1; index < data.length; index++)
			{
				if (data[index] > maxValue)
				{
					maxValue = data[index];
					maxIndex = index;
				}
			}
			data[maxIndex] = data[startScan];
			data[startScan] = maxValue;
		}
	}
		
	public void calculateMean()
	{
		int total = 0;
		for (int i = 0; i < data.length; i++)
		{
			total = total + data[i];
		}
		mean = total/data.length;
	}
	
	public String toString()
	{
		String output;
		output ="The test scores in descending order are \n";
		
		for (int i = 0; i < data.length; i++)
		{
			output = output + data[i] + "     ";
		}
		output = output + "\nThe average is " + mean;
		return output;
	}
}