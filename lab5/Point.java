// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: describe a point in 2D space

public class Point
{
    protected int x;
    protected int y;
    

    public Point(int x, int y)
    {
        setPoint(x, y);
    }

    public void setPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return " x = " + x + ", y = " + y;
    }
}