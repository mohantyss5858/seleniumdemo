package testngextra;

import org.testng.annotations.Test;

public class Priority
{
	@Test(priority = 2)
	public void boss()
	{
		System.out.println("boss");
	}
	
	@Test(priority = 3)
	public void bijit()
	{
		System.out.println("bijit");
	}
	
	@Test(priority = 1)
	public void sandhya()
	{
		System.out.println("sandhya");
	}
}
