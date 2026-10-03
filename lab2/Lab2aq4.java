// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Sept-2026
// Purpose 			: manage the rooms in a Hotel

public class Lab2aq4
{ // begin class
	public static void main(String args[]) 
	{ // being main method
	
		HotelRoom roomA= new HotelRoom();		// Create an instance of class
		HotelRoom roomB= new HotelRoom();
		HotelRoom roomC= new HotelRoom(202, "Single", false, 90);
		
		
		roomA.setHotelRoom(200, "Single", true, 100);
		System.out.println("roomA (room number is " + roomA.getNumber() + ", type is " + roomA.getType() +
		 ", state is " + roomA.getOccupied() + ", rate is " + roomA.getRate() + ")" );
		 
		 
		 
		roomB.setHotelRoom(201, "Double", true, 80);
		System.out.println("roomB (room number is " + roomB.getNumber() + ", type is " + roomB.getType() + 
				 ", state is " + roomB.getOccupied() + ", rate is " + roomB.getRate() + ")" );
				 
		if(roomB.getOccupied() == true)
		{		 
			System.out.println(" Error. Room " + roomB.getNumber() + " is already occupied. ");	
		}
		else
		{
			roomB.setHotelRoom(201, "Double", true, 80);
			System.out.println("roomB (room number is " + roomB.getNumber() + ", type is " + roomB.getType() + 
			 ", state is " + roomB.getOccupied() + ", rate is " + roomB.getRate() + ")" );
		}
		 
		 
		 
		 System.out.println("roomC (room number is " + roomC.getNumber() + ", type is " + roomC.getType() + 
		 ", state is " + roomC.getOccupied() + ", rate is " + roomC.getRate() + ")" );
	
	}
}