package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class ActitimeLogout 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.Logout();

	}

}
