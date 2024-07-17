package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class JSExecutor extends BaseClass {

	public static void click(WebElement wb)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	
	WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
	
	js.executeScript("arguments[0].click();",wb1);
		
	}
	
	
	public static void sendKeys(WebElement wb,String value)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb2=wait.until(ExpectedConditions.visibilityOf(wb));
	
	js.executeScript("arguments[0].value='"+value+"';", wb2);

	}
	
	public static void scrollIntoView(WebElement wb)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	
	WebElement wb2=wait.until(ExpectedConditions.visibilityOf(wb));
	
	js.executeScript("arguments[0].scrollIntoView(true);", wb2);
		
		
	}
	
	public static void createBorderForElement(WebElement wb)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	
	WebElement wb3=wait.until(ExpectedConditions.visibilityOf(wb));
	
	js.executeScript("arguments[0].style.border='3px solid red';", wb3);
		
		
	}
	
	public static void get(String url)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].location='"+url+"';");
		
	}
	
	
	public static void newWindowUrl(String url)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].open('"+url+"');");

	}
	
	public static void forward(int forward)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(+"+forward+")");
	}
	
	
	public static void back(int back)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("history.go(-"+back+")");
	}
	
	
	public static void refresh()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	public static String getTitle()
	{
	JavascriptExecutor js=(JavascriptExecutor)	driver;
	
	String title=js.executeScript("return document.TITLE").toString();
	
	return title;

	}
	
	public static String getCurrentUrl()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String currentUrl=	js.executeScript("return document.URL").toString();
	return currentUrl;
	}
	
	
	
}
