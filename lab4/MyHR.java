// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Rudimentary HR system to help administer the growing number of employees in the company.
//					  The system will manage the employees details and office number allocation.

public class MyHR
{
	public static void main(String args[])
	{

        Office office1 = new Office();
        Office office2 = new Office();
        Office office3 = new Office();

        System.out.println("All offices:");
        System.out.println(office1);
        System.out.println(office2);
        System.out.println(office3);

        
        Employee e1 = new Employee("Sara", "Staff", "", new Address("Lower St", "Dublin", "Dublin"));
        Employee e2 = new Employee("Sonya", "Manager", "Toyota", new Address("Templeshannon", "Wexford", "Wexford"));
        Employee e3 = new Employee("Mark", "Staff", "", new Address("St Johns", "Gorey", "Wexford"));
        Employee e4 = new Employee("John", "Manager", "Ford", new Address("Mariia", "Kilkenny", "Kilkenny"));
        Employee e5 = new Employee("Malek", "Staff", "", new Address("Marine St", "Waterford", "Waterford"));


        office1.addEmployee(e1);
        office1.addEmployee(e2);
        office2.addEmployee(e3);
        office2.addEmployee(e4);
        office3.addEmployee(e5);


        System.out.println("Number of employees: " + Employee.getCount());


        System.out.println("All employees:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);


        System.out.println("Offices with employees:");
        System.out.println(office1);
        office1.printEmployees();
        System.out.println(office2);
        office2.printEmployees();
        System.out.println(office3);
        office3.printEmployees();
		
		System.out.println("Employees in office1: " + office1.getEmployeesCount());
		System.out.println("Employees in office2: " + office2.getEmployeesCount());
		System.out.println("Employees in office3: " + office3.getEmployeesCount());


		System.out.println("All offices:");
        System.out.println(office1);
        System.out.println(office2);
        System.out.println(office3);
	}
}