// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Bank customer


public class BankCustomer
{
	private String name;
	private String address;
	private int accountsNumber;
	private SavingsAccount[] accounts;



	public BankCustomer()		// def constructor method
	{
		accountsNumber = 0;
		accounts = new SavingsAccount[3];
		setBankCustomer("", "");
	}

	public BankCustomer(String nam, String addr)		// 2nd  constructor method
	{
		accountsNumber = 0;
		accounts = new SavingsAccount[3];
		setBankCustomer(nam, addr);
	}

	//setters

	public void setBankCustomer(String nam, String addr)
	{
		name = nam;
		address = addr;
	}

	//getters

	public double totalBalance()
	{
		double total = 0.0;
		for (int i = 0; i < accountsNumber; i++)
		{
			total += accounts[i].getSavingsBalance();
		}
		return total;
	}

	//void
	public void addAccount(SavingsAccount acc)
	{
		if (accountsNumber >= 3)
		{
			System.out.println("Can't add account " + acc.getNumber() + ": customer already has 3 accounts.");
		}
		else
		{
			accounts[accountsNumber] = acc;
			accountsNumber ++;
		}
		
	}
	
	public void summary()
	{
		System.out.println(name + "'s account numbers are:");
		for (int i = 0; i < accountsNumber; i++)
		{
			System.out.println("Account " + accounts[i].getNumber() + ": balance " + accounts[i].getSavingsBalance());
		}
	}
	
	
}