public class Employee extends Person
{
	private double salary;

	public Employee(String name, double salary)
	{
		super(name);
		this.salary = salary;
	}

	public String getDescription()
	{
		return "this employee has a salary of " + salary;
	}
}
