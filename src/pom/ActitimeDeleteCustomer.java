package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeDeleteCustomer 
{
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	
	@FindBy(xpath="(//div[@class='node customerNode notSelected editable'])[3]")
	private WebElement qspiderlink;
	
	@FindBy(xpath="(//div[@class='editButton'])[12]")
	private WebElement settingsbutton;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionslink;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deletebutton;


public ActitimeDeleteCustomer(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void deletemethod() throws InterruptedException
{
	taskbutton.click();
	Thread.sleep(5000);
	qspiderlink.click();
	settingsbutton.click();
	actionslink.click();
	deletebutton.click();
}


}