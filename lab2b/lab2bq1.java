// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Sept-Oct-2026
// Purpose 			: 

public class Lab2bq1
{ // begin class
	public static void main(String args[]) 
	{ // being main method
		
		Rectangle r1 = new Rectangle();		// Create an instance of class
		Rectangle r2 =  new Rectangle();
		Rectangle r3 =  new Rectangle();
		
		
		r1.setRectangle(5, 4);
		System.out.println(r1.toString());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		r1.printRectangle();

		r2.setRectangle(-2, 8);
		System.out.println(r2.toString());
		System.out.println(r2.getArea());
		System.out.println(r2.getPerimeter());
		r2.printRectangle();

		r3.setRectangle(2, 0);
		System.out.println(r3.toString());
		System.out.println(r3.getArea());
		System.out.println(r3.getPerimeter());
		
	}
}
