public class Sphere extends ThreeDShape
{
	private double radius;

	public Sphere(String name, String colour, double radius)
	{
		super(name, colour);
		this.radius = radius;
	}

	public double area()
	{
		return 4 * 3.141592653589793 * radius * radius;
	}

	public double volume()
	{
		return (4.0 / 3.0) * 3.141592653589793 * radius * radius * radius;
	}

	public String toString()
	{
		return (super.toString() + "\nRadius = " + radius);
	}
}
