package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeCreateLeaveType;
import pom.ActitimeCreateTypeOfwork;
import pom.ActitimeEditDeleteLeaveType;
import pom.ActitimeSetting;
public class ActitimeTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        ActitimeCreateLeaveType leave=new ActitimeCreateLeaveType(driver);
        leave.createTypeLeaveMethod();
        
        ActitimeCreateTypeOfwork type=new ActitimeCreateTypeOfwork(driver);
        type.createATypeOfWorkmethod();
        
        ActitimeEditDeleteLeaveType edit=new ActitimeEditDeleteLeaveType(driver);
        edit.editLeaveTypeMethod();
        edit.deleteMethod();
        
        ActitimeSetting settings=new ActitimeSetting(driver);
        settings.typesOfWorkMethod();
        settings.LeaveTypesMethod();
        
              
	}

}
