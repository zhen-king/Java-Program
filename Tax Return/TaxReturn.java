
public class TaxReturn 
{
	public static final String SINGLE = "S";
	public static final String MARRIED = "M";
	
	private static final double RATE1 = .10;
	private static final double RATE2 = .25;
	private static final double LIMIT_SINGLE = 32000;
	private static final double LIMIT_MARRIED = 64000;
	
	private double income;
	private String status;
	
	public TaxReturn(double pIncome, String pStatus)
	{
		income= pIncome;
		status= pStatus;
	}
	
	public double getTax()
	{
		double taxI = 0.0;
		double taxO = 0.0;
		
		if (status.equals(SINGLE))
		{
			if(income<=LIMIT_SINGLE)
			{
				taxI = income * RATE1;
			}
			else
			{
				taxI = LIMIT_SINGLE * RATE1;
				taxO = (income - LIMIT_SINGLE)* RATE2;
			}
		}
		else
		{
			if(income<=LIMIT_MARRIED)
			{
				taxI = income * RATE1;
			}
			else
			{
				taxI = LIMIT_MARRIED * RATE1;
				taxO = (income - LIMIT_MARRIED)* RATE2;
			}
		
		}
		return taxI + taxO;
	
	}
}
