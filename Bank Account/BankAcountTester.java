
public class BankAcountTester {

	public static void main(String[] args) 
	{
		BankAccount harrysChecking = new BankAccount();
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		System.out.println(harrysChecking.getBalance());
		System.out.println("Expected: 1500");

	}

}
