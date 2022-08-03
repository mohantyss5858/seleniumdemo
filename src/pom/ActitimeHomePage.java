package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[5]")
	private WebElement bulbbutton;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutbutton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement questionbutton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement puzzlenbutton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingbutton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendarbutton;
	
	@FindBy(xpath="//div[@id=\"container_tt\"]")
	private WebElement timetrackbutton;
	
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportsbutton;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement userbutton;
	
	@FindBy(xpath="//div[@class='logoSwitcherText']")
	private WebElement switchtoactiplanbutton;
	
	@FindBy(xpath = "//div[@class='supportQuestionButton']")
	private WebElement tooltip;
	
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Logout()
	{
		logoutbutton.click();
	}
}
