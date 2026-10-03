// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Sept-2026
// Purpose 			: manage the rooms in a Hotel

public class Lab2aq1
{ // begin class
	public static void main(String args[]) 
	{ // being main method
	
		HotelRoom roomA= new HotelRoom();		// Create an instance of class
		HotelRoom roomB=  new HotelRoom();
		
		
		roomA.setHotelRoom(200, "Single");
		System.out.println("roomA (room number is " + roomA.getNumber() + ", type is " + roomA.getType() + ")" );
		roomB.setHotelRoom(201, "Double");
		System.out.println("roomB (room number is " + roomB.getNumber() + ", type is " + roomB.getType() + ")" );
	
	}
}