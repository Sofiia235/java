// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Bank Customer driver program

public class lab3aq3
{ // begin class
	public static void main(String args[]) 
	{ // being main method
		
		SavingsAccount saver1= new SavingsAccount(2000);		// Create an instance of class
		SavingsAccount saver2= new SavingsAccount(3000.00);
		SavingsAccount saver3 = new SavingsAccount(1000);
		SavingsAccount saver4 = new SavingsAccount(500);
		

		BankCustomer customer = new BankCustomer("Aldi", "67 Mary's Street");
		customer.addAccount(saver1);
		customer.addAccount(saver2);
		customer.addAccount(saver3);
		customer.addAccount(saver4);

		
		customer.summary();
		System.out.println("Total balance: " + customer.totalBalance());

	
	}
}