package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {

	//create the Object Repository by using @FindBy annotation
	
	@FindBy(name="username")
	private WebElement uname;
	
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;
	
	//initialize the Object repository by using @PageFactory.initElements() method in constructor
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//create associated methods for each and every Object repository without entering the test data
	public void loginPageFunctionality(String Uname,String Pass)
	{
		
		Wait.sendKeys(uname, Uname);
		Wait.sendKeys(pass, Pass);
		Wait.click(loginbutton);
		
		
	}
	
}
