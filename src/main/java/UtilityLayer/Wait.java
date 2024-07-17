package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{

	
//sendKeys() method
	
	public static void sendKeys(WebElement wb,String value)
	{
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}
	
	//click() method
	public static void click(WebElement wb)
	{
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	//getText() method
	public static String getText(WebElement wb)
	{
		
	return	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).getText();
	}
	
	
	//getAttribute() method
	public static String getAttribute(WebElement wb,String value)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).getAttribute(value);
	}
	
	
	//select anyone option from List<WebElement>
	public static void selectanyOneOption(List<WebElement>ls,String value)
	{
	List<WebElement>allWb=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(ls));
	
	for(WebElement wbn:allWb)
	{
		if(wbn.getText().equalsIgnoreCase(value))
		{
			wbn.click();
			break;
		}
	}
	

	}
	
	
	
	
	
}
