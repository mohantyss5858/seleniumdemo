package testngextra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssert
{
	public WebDriver driver;
	
	@Test
	public void verifyloginpage()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String expectedtitle="boss";
		String actualtitle= driver.getTitle();
		//Assert.assertEquals(actualtitle, expectedtitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		System.out.println("execution complete");
		s.assertAll();
		System.out.println("kian");
	}
	@Test
	public void bapa()
	{
		System.out.println("bapaa");
		
	}
}
