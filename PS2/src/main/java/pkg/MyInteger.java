package pkg;


public class MyInteger 
{
	private int iValue = 0;

	public MyInteger(int ivalue) 
	{
		iValue = ivalue;
	}

	public int getiValue()
	{
		return this.iValue;
	}

	public boolean isEven()
	{
		if((this.iValue % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if((this.iValue % 2) == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean isPrime()
	{
		boolean b = true;
		for(int i = 2;i < this.iValue;i++)
		{
			if(this.iValue % i == 0)
			{
				b = false;
			}
		}
		return b;
	}
	
	public static boolean isEven(int iValue)
	{
		if((iValue % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int iValue)
	{
		if((iValue % 2) == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean isPrime(int iValue)
	{
		boolean b = true;
		for(int i = 2;i < iValue;i++)
		{
			if(iValue % i == 0)
			{
				b = false;
			}
		}
		return b;
	}
	
	public static boolean isEven(MyInteger x)
	{
		if((x.iValue % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger x)
	{
		if((x.iValue % 2) == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean isPrime(MyInteger x)
	{
		boolean b = true;
		for(int i = 2;i < x.iValue;i++)
		{
			if(x.iValue % i == 0)
			{
				b = false;
			}
		}
		return b;
	}
	
	public boolean equals(int x)
	{
		if(this.iValue == x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger x)
	{
		if(this.iValue == x.iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	


}

