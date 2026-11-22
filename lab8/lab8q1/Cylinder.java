public class Cylinder extends ThreeDShape
{
	private double radius;
	private double height;

	public Cylinder(String name, String colour, double radius, double height)
	{
		super(name, colour);
		this.radius = radius;
		this.height = height;
	}

	public double area()
	{
		return 2 * 3.141592653589793 * radius * radius + 2 * 3.141592653589793 * radius * height;
	}

	public double volume()
	{
		return 3.141592653589793 * radius * radius * height;
	}

	public String toString()
	{
		return (super.toString() + "\nRadius = " + radius + "\nHeight = " + height);
	}
}
