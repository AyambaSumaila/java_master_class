import java.io.*;
import java.util.StringTokenizer;

public class SecretMessage
{
	public static void main (String [] args)throws IOException
	{
		FileReader file = new FileReader ("secret.txt");		
		BufferedReader input = new BufferedReader (file);
		StringTokenizer tokenizer;
		String fileContents;
		String wordToken;
		int count = 0;
		char letter;
		StringBuffer strbuff = new StringBuffer();
		
		fileContents = input.readLine();
		tokenizer = new StringTokenizer (fileContents);
		while (tokenizer.hasMoreTokens())
		{
			wordToken = tokenizer.nextToken();
			if (count%5 ==0)
			{
				letter = wordToken.charAt(0);
				letter = Character.toUpperCase(letter);
				strbuff.append(letter);
			}
			count++;
		}
		System.out.println(strbuff);
	}
}
		
			
			
		