package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeCreateNewCustomer
{
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	
	@FindBy(xpath = "//div[@class='title ellipsis']")
	private WebElement addnew;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement createnewcustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomername;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionarea;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomer;
	
	public ActiTimeCreateNewCustomer (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void createCustomer()
{
	taskbutton.click();
	addnew.click();
	createnewcustomer.click();
	entercustomername.sendKeys("qspider");
	descriptionarea.sendKeys("watch it carefully");
	createcustomer.click();
}
	
}
	
