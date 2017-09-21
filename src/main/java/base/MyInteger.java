package base;

public class MyInteger 
{
	
	private int Number;
	
	public MyInteger(int iValue) 
	{
		Number = iValue;
	}

	public int getNumber() 
	{
		
		return Number;
	}
	

	
	public boolean isEven() 
	{
		if (Number % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() 
	{
		if (Number % 2 != 0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime() 
	{	
		for (int i = 2; i < Number;i++) 
		{
			if (Number % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int Number) {
		if (Number % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int Number) 
	{
		if (Number % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int Number) 
	{
		for (int i = 2; i < Number; i++) {
			if (Number % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger iValue) 
	{
		return MyInteger.isEven(iValue.getNumber());
	}
	
	public static boolean isOdd(MyInteger iValue) 
	{
		return MyInteger.isOdd(iValue.getNumber());
	}
	
	public static boolean isPrime(MyInteger iValue) 
	{
		return MyInteger.isPrime(iValue.getNumber());
	}
	
	public boolean equals(int iValue) 
	{
		return getNumber() == iValue;
	}
	
	public boolean equals(MyInteger iValue) 
	{
		return equals(iValue.getNumber());
	}
	
}