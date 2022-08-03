package testngextra;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 2)
	public void boss()
	{
		System.out.println("boss");
	}
	
	@Test(invocationCount = 3)
	public void bijit()
	{
		System.out.println("bijit");
	}
	
	@Test(invocationCount = 2)
	public void sandhya()
	{
		System.out.println("sandhya");
	}
}
