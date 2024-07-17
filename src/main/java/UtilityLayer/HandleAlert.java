package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass{

	
	//accept() method to click on OK button
	
	public static void accept()
	{
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).accept();
	}
	
	//dismiss() method to click on Cancel button
	public static void dismiss()
	{
		
	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).dismiss();
	}
	
	//getText() method to capture the alert text
	public static String getText()
	{
	return	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).getText();
	}
	
	//sendKeys() method to send the text in alert textbox
	public static void sendKeys(String value )
	{
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
}
