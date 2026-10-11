// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Count a second from current time.

import java.util.Calendar;

public class Clock
{ // begin class
	public static void main(String args[]) 
	{ // being main method

		
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		do
		{
			t.tick();
			System.out.println(t.toString());
			
			long start = System.currentTimeMillis();				//long = large whole numbers. better be inside a loop?
			while ( System.currentTimeMillis() - start < 1000)
			{
				//nothing
			}
		}
		while(t.getSecond() != 0);
		
	}
}


/// System.currentTimeMillis()