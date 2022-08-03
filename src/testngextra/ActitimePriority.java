package testngextra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom.ActitimeCreateLeaveType;
import pom.ActitimeCreateTypeOfwork;
import pom.ActitimeLoginPage;
public class ActitimePriority
{
	
	private WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
			
	}
	/*
	 * @Test (priority = 2) public void CreateLeaveType() throws
	 * InterruptedException { ActitimeCreateLeaveType leave=new
	 * ActitimeCreateLeaveType(driver); leave.createTypeLeaveMethod(); }
	 * 
	 * @Test (priority = 3) public void CreateTypeOfwork() throws
	 * InterruptedException { ActitimeCreateTypeOfwork type=new
	 * ActitimeCreateTypeOfwork(driver); type.createATypeOfWorkmethod(); }
	 */
}
