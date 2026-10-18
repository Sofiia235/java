// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Office class


public class Office
{
    private static int startRoom = 100;
    private static final int MAX_EMPLOYEES_OFFICE = 2;

	private int roomNumber;
    private final Employee[] employees;
    private int employeesCount;
	
	
    public Office()
    {
        roomNumber = startRoom;
        startRoom++;
        employees = new Employee[MAX_EMPLOYEES_OFFICE];
        employeesCount = 0;
    }

        public Office(Employee employee1)
    {
        roomNumber = startRoom;
        startRoom++;
        employees = new Employee[MAX_EMPLOYEES_OFFICE];
        employeesCount = 0;
        addEmployee(employee1);
    }

    public Office(Employee employee1, Employee employee2)
    {
        roomNumber = startRoom;
        startRoom++;
        employees = new Employee[MAX_EMPLOYEES_OFFICE];
        employeesCount = 0;
        addEmployee(employee1);
        addEmployee(employee2);
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public int getEmployeesCount()
    {
        return employeesCount;
    }

    public void printEmployees()
    {
        for (int i = 0; i < employeesCount; i++)
        {
            System.out.println(employees[i]);
        }
    }

    public void addEmployee(Employee employee)
    {
        if (employeesCount < MAX_EMPLOYEES_OFFICE)
        {
            employees[employeesCount] = employee;
            employeesCount++;
            employee.setOffice(this);   //this object "Office"
        }
        else
        {
            System.out.println("Employee can't be added, the office is full");
        }
    }
	
	public String toString()
    {
        return "Room: " + roomNumber + ", Employees: " + employeesCount;
    }

}