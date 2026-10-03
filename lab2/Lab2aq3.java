// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Sept-2026
// Purpose 			: manage the rooms in a Hotel

public class Lab2aq3
{ // begin class
	public static void main(String args[]) 
	{ // being main method
	
		HotelRoom roomA= new HotelRoom();		// Create an instance of class
		HotelRoom roomB=  new HotelRoom();
		HotelRoom roomC=  new HotelRoom(202, "Single", 0, 90);
		
		
		roomA.setHotelRoom(200, "Single", 1, 100);
		System.out.println("roomA (room number is " + roomA.getNumber() + ", type is " + roomA.getType() +
		 ", state is " + roomA.getState() + ", rate is " + roomA.getRate() + ")" );
		 
		roomB.setHotelRoom(201, "Double", 0, 80);
		System.out.println("roomB (room number is " + roomB.getNumber() + ", type is " + roomB.getType() + 
		 ", state is " + roomB.getState() + ", rate is " + roomB.getRate() + ")" );
		 
		 System.out.println("roomC (room number is " + roomC.getNumber() + ", type is " + roomC.getType() + 
		 ", state is " + roomC.getState() + ", rate is " + roomC.getRate() + ")" );
	
	}
}