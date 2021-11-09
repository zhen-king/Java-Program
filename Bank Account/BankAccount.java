
public class BankAccount
{
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}

	public BankAccount(double intialBalance)
	{
		balance = intialBalance;
	}

	public void deposit(double amount)
	{
		balance= balance + amount;
	}

	public void withdraw(double amount)
	{
		balance= balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
}		

