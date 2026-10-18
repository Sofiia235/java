// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Employee class

public class Employee
{
	private static int count = 0;
    private static int startNumber = 1000;
    private static final int MAX_EMPLOYEES = 5;

	private int number;
    private String name;
    private String type;
    private String car;
    private Address address;
    private Office office;
	
	
    public Employee()		// def constructor method
	{
		setEmployee("", "", "", new Address());
        number = startNumber + count;
        count++;
	}

    public Employee(String name, String type, String car, Address address)          // 2nd  constructor method
    {
        setEmployee(name, type, car, address);
        number = startNumber + count;
        count++;
    }

    public void setEmployee(String name, String type, String car, Address address)
    {
        this.name = name;
        this.type = type;
        this.car = car;
        this.address = address;
    }

    public void setOffice(Office office)
    {
        this.office = office;
    }


    public int getNumber()
    {
        return number;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public String getCar()
    {
        return car;
    }

    public static int getCount()
    {
        return count;
    }
	
    public String toString()
    {
        String text = number + ", " + name + ", " + type + ", " + address;
        if (type.equals("Manager"))
        {
            text = text + ", Car: " + car;
        }
        return text + ", Office: " + office.getRoomNumber();
    }
}