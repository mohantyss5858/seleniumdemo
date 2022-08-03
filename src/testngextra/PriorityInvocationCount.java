package testngextra;

import org.testng.annotations.Test;

public class PriorityInvocationCount 
{
	@Test(priority = 1, invocationCount = 2)
	public void boss()
	{
		System.out.println("boss");
	}
	
	@Test(priority = 2, invocationCount = 3)
	public void bijit()
	{
		System.out.println("bijit");
	}
	
	@Test(priority = 3, invocationCount = 5)
	public void sandhya()
	{
		System.out.println("sandhya");
	}
}
