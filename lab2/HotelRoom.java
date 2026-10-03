// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Sept-2026
// Purpose 			: HotelRoom class


public class HotelRoom
{
	private int roomNumber;
	
	private String roomType;
	
	private boolean isOccupied;
	
	private double roomRate;
	
	
	
	public void setHotelRoom(int n, String t, boolean s, double r)
	{
		roomNumber = n;
		roomType = t;
		isOccupied = s;
		roomRate = r;
	}
	
	
	
	public HotelRoom()               									// constructor method
	{
		setHotelRoom(0, "", false, 0.0);            
	}
	
	
	
	
	public HotelRoom(int n, String t, boolean s, double r)               // constructor method #2
	{
		setHotelRoom(n, t, s, r);            
	}
	
	
	
	
	public int getNumber()
	{
		return roomNumber;
	}
	
	public String getType()
	{
		return roomType;
	}
	
	public boolean getOccupied()
	{
		return isOccupied;
	}
	
	
	public double getRate()
	{
		return roomRate;
	}
}



