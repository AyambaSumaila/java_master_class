import java.io.*;

public class CompactDisc
{
	@SuppressWarnings("resource")
	public static void main(String [] args) throws IOException
	{
		FileReader file = new FileReader("Classics.txt");
		BufferedReader input = new BufferedReader(file);
		String title;
		String artist;
		
		Song [] cd = new Song [6];
		for (int i = 0; i < cd.length; i++)
		{
			title = input.readLine();
			artist = input.readLine();	
			cd[i] = new Song(title, artist);
		}
		
		System.out.println("Contents of Classics:");
		for (int i = 0; i < cd.length; i++)
		{
			System.out.print(cd[i].toString());
		}
	}
}