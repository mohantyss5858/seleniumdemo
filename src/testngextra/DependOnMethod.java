package testngextra;

import org.testng.annotations.Test;

public class DependOnMethod 
{
	@Test
	public void login()
	{
		System.out.println("login");
	}
	
	@Test (dependsOnMethods = "login")
	public void createcustomer()
	{
		System.out.println("createcustomer");
	}
	
	@Test(dependsOnMethods = "createcustomer")
	public void delete()
	{
		System.out.println("delete");
	}
}
