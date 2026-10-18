// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Address class

public class Address
{
	private String street;
	private String city;
	private String county;
	
	
	public Address()		// def constructor method
	{
		setAddress("", "", "");
	}

	public Address(String str, String cit, String co)		// 2nd  constructor method
	{
		setAddress(str, cit, co);
	}
	
	
	public void setAddress(String str, String cit, String co)
	{
		street = str;
		city = cit;
		county = co;
	}
	
	
	public String toString() 
    {
        return street + ", " + city + ", " + county;
    }
	
}