public class TestPerson
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		people[0] = new Employee("John Murphy", 45000);
		people[1] = new Student("Sarah Kelly", "Computing");

		for (int i = 0; i < people.length; i++)
		{
			System.out.println(people[i].getName() + ": " + people[i].getDescription());
		}
	}
}
