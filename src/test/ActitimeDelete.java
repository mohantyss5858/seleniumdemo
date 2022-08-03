package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeDeleteCustomer;
import pom.ActitimeLoginPage;

public class ActitimeDelete 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeDeleteCustomer delete=new ActitimeDeleteCustomer(driver);
		delete.deletemethod();
		

	}

}
