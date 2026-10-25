// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: describe a point in 2D space

public class Circle extends Point
{
    private int radius;


    public Circle(int x, int y, int radius)
    {
        super(x, y);
        setCircle(x, y, radius);
    }

    public void setCircle(int x, int y, int radius)
    {
        setPoint(x, y);
        this.radius = radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    @Override 
    public String toString()
    {
        return "Center - " + super.toString() + ", radius = " + radius;
    }
}