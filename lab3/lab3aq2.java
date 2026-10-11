// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Savings account driver program

public class lab3aq2
{ // begin class
	public static void main(String args[]) 
	{ // being main method
	
		SavingsAccount saver1= new SavingsAccount(2000);		// Create an instance of class
		SavingsAccount saver2= new SavingsAccount(3000.00);
		

		SavingsAccount.modifyInterestRate(0.04);
		System.out.println("saver" + saver1.getNumber() + " Your monthly interest is: " + saver1.calculateMonthlyInterest() + ". " + 
		"Your new balance is: " + saver1.getSavingsBalance() + ".");
		System.out.println("saver" + saver2.getNumber() + " Your monthly interest is: " + saver2.calculateMonthlyInterest() + ". " + 
		"Your new balance is: " + saver2.getSavingsBalance() + ".");

		System.out.println("One month later");

		SavingsAccount.modifyInterestRate(0.05);
		System.out.println("saver" + saver1.getNumber() + " Your monthly interest is: " + saver1.calculateMonthlyInterest() + ". " + 
		"Your new balance is: " + saver1.getSavingsBalance() + ".");
		System.out.println("saver" + saver2.getNumber() + " Your monthly interest is: " + saver2.calculateMonthlyInterest() + ". " + 
		"Your new balance is: " + saver2.getSavingsBalance() + ".");

	
	}
}