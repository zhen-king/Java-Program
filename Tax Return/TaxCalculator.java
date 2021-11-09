import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	
	String status;
	double income;
	
	System.out.print("Please enter your income:");
	income = in.nextDouble();

	while(income<=0)
	{
		System.out.println("Income can not be negative!");
		System.out.println("Please enter your income:");
		income = in.nextDouble();
	}
	
	System.out.print("Are you married? (Y/N)");
	String answer = in.next();
	
	
	
	if (answer.equals("Y"))
	{
		status = TaxReturn.MARRIED;
	}
	else
	{
		status = TaxReturn.SINGLE;
	}
	
	TaxReturn tx = new TaxReturn(income,status);
	System.out.println("Tax:"+tx.getTax());
	

	
		
	
	}

}
