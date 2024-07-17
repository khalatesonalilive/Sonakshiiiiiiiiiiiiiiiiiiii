package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{

	//frame(IDorName)
	public static void frame(String IDorName)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IDorName));
	}
	
	//frame(index) method
	public static void frame(int index)
	{
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	//frame(WebElement wb)method
	public static void frame(WebElement wb)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
	}
	
	//switchTo top frame by using defaultContent() method
	public static void defaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	//switchTo immediate frame by using parentFrame() method
	public static void parentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
