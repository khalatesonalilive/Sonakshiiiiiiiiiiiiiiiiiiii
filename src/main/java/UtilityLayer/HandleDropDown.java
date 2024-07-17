package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	//selectByVisibleText() method
	public static void selectByVisibleText(WebElement wb,String value)
	{
		
	WebElement wb1=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	
	new Select(wb1).selectByVisibleText(value);
	}
	
	//selectByValue() method
	public static void selectByValue(WebElement wb,String value)
	{
	WebElement wb2=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	
	new Select(wb2).selectByValue(value);
	}
	
	//selectByIndex
	public static void selectByIndex(WebElement wb,int index)
	{
	WebElement wb3=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	
	new Select(wb3).selectByIndex(index);
	
	}
	
	//getOptions() method
	public static void getOptions(WebElement wb)
	{
		
	WebElement wb4=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	
	List<WebElement>ls=new Select(wb4).getOptions();
	
	for(WebElement wbnn:ls)
	{
		System.out.println(wbnn.getText());
	}
	}
	//count drop down size()
	public static int size(WebElement wb)
	{
	WebElement wb5=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	
	List<WebElement > ls=new Select(wb5).getOptions();
	
	return ls.size();
	}
	
	//select specificvalue from drop down
	public static String selectSpecificValue(WebElement wb,String value)
	{
		
	WebElement wb6=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb))	;
	
      List<WebElement>ls=new Select(wb6).getOptions();
   for(WebElement wbnew:ls)
   {
	   if(wbnew.getText().equalsIgnoreCase(value)) 
	   {
	   
		 return  wbnew.getText();
		   
	   }}
	   return null;
	   
   }
	
	
	
	//getFirstSelectedOption() method
public static String getFirstSelectedOption(WebElement wb)
{
	WebElement wb7=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	
	return new Select(wb7).getFirstSelectedOption().getText();
	
}
	
	
	
	
}

