//Represents time in hours and minutes using 
//the customary conventions

public class Time
{
	//hours in conventional time
	private int hours;
	//minutes in conventional time	
	private int minutes;	
	//true if afternoon time, false if morning time
	private boolean afternoon;	

	//Constructs a cutomary time (12 hours, am or pm)
	//from a military time
	public Time(String militaryTime)
	{
		//Check to make sure something was entered
		if (militaryTime == null)
		{
			System.out.println(
				"You must enter a valid miliary time." );
		}
		//Check to make sure there are 5  characters
		else if (militaryTime.length()!= 5)
		{
			System.out.println(militaryTime + 
				" is not a valid miliary time." );
		}
		else
		{
			//Check to make sure the colon is in 
			//the correct spot
			if (militaryTime.charAt(2)!= ':')
			{
				System.out.println(militaryTime + 
					" is not a valid miliary time." );
			}
			//Check to make sure all other characters are digits
			else if (!Character.isDigit(militaryTime.charAt(0)))
			{
				System.out.println(militaryTime + 
					" is not a valid miliary time." );
			}
			else if (!Character.isDigit(militaryTime.charAt(1)))
			{
				System.out.println(militaryTime + 
					" is not a valid miliary time." );
			}
			else if (!Character.isDigit(militaryTime.charAt(3)))
			{
				System.out.println(militaryTime + 
					" is not a valid miliary time." );
			}
			else if (!Character.isDigit(militaryTime.charAt(4)))
			{
				System.out.println(militaryTime + 
					" is not a valid miliary time." );
			}
			else
			{
				//separate the string into hours and the 
				//minutes, converting them to integers
				hours = Integer.parseInt(militaryTime.substring(0,2));
				minutes = Integer.parseInt(militaryTime.substring(3,5));
				
				//validate that hours and minutes are valid values
				if(hours > 23)
				{
					System.out.println(militaryTime + 
						" is not a valid miliary time." );
				}
				else if(minutes > 59)
				{
					System.out.println(militaryTime + 
						" is not a valid miliary time." );
				}
				//convert military time to conventional time
				//for afternoon times
				else if (hours > 12)
				{
					hours = hours - 12;
					afternoon = true;
					System.out.println(this.toString());					
				}
				//account for midnight
				else if (hours == 0)
				{
					hours = 12;
					System.out.println(this.toString());
				}
				//account for noon
				else if (hours == 12)
				{
					afternoon = true;
					System.out.println(this.toString());
				}
				//morning times don't need converting
				else
				{
					System.out.println(this.toString());
				}
			}
		}
	}

	public String toString()
	{
		String am_pm;
		String zero = "";
		if (afternoon)
			am_pm = "PM";
		else
			am_pm = "AM";
		if (minutes < 10)
			zero = "0";
		
		return hours + ":" + zero + minutes + " " + am_pm;
	}
}