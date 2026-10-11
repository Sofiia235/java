// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Oct-2026
// Purpose 			: Savings account


public class SavingsAccount
{
	private static int count = 0;
	private int number;
	private static double annualInterestRate=0.00;		//decimal (not percentage) 
	private double savingsBalance;
	
	
	
	
	public SavingsAccount()			// def constructor method
	{
		number = ++count;
		setSavingsAccount(0.00);
	}

	public SavingsAccount(double bal)			// 2nd  constructor method
	{
		number = ++count;
		setSavingsAccount(bal);
	}
	
	//setters

	public void setSavingsAccount(double b)
	{
		savingsBalance = b;
	}
	
	
	//getters

	public double getSavingsBalance()
	{
		return savingsBalance;
	}

	public int getNumber()
	{
		return number;
	}
	
	
	public double calculateMonthlyInterest()
	{
		double interest = savingsBalance * (annualInterestRate / 12);
		savingsBalance += interest;
		return interest;
	}
	
	//void

	public static void modifyInterestRate(double interestNew)
	{
		annualInterestRate = interestNew;		//decimal (not percentage) 
	}
	
}