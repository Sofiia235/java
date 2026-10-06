// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Sept-Oct-2026
// Purpose 			: 


public class Rectangle
{
	private double length;
	private double width;
	
	
	public void setRectangle(double l, double w)
	{
		if (l > 0.0 && l <= 40.0 && w > 0.0 && w <= 40.0)
		{
			length = l;
			width = w;
		}
		else
		{
			setRectangle(1, 1);
		}
	}
	
	public Rectangle()				// def constructor method
	{
		setRectangle(1, 1);
	}
	
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	
	public String toString()
	{
		return "Length = " + length + ", Width = " + width;
	}
	
	
	public String getArea()
	{
		return "The area is " + (length * width);
	}
	public String getPerimeter()
	{
		return "The perimeter is " + (2*length + 2*width);
	}
	
	
	printRectangle()
	{
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j < width; j++)
			{
				if (i == 0 || i == length-1 || j == 0 || j == width-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
