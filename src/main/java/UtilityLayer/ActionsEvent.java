package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class ActionsEvent extends BaseClass{

	public static void click(WebElement wb)
	{
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
		
	WebElement wb1=	wait.until(ExpectedConditions.visibilityOf(wb));
		
		Actions act=new Actions(driver);
		act.click(wb1).build().perform();
	}
	
	public static void doubleClick(WebElement wb)
	{
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb2=wait.until(ExpectedConditions.visibilityOf(wb));
	
	Actions act=new Actions(driver);
	act.doubleClick(wb2).build().perform();
	}
	
	
	public static void contextClick(WebElement wb)
	{
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb3=wait.until(ExpectedConditions.visibilityOf(wb));
	
	Actions act=new Actions(driver);
	act.contextClick(wb3).build().perform();
	}
	
	public static void moveToElement(WebElement wb)
	{
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb4=wait.until(ExpectedConditions.visibilityOf(wb));
	
	Actions act=new Actions(driver);
	act.moveToElement(wb4).build().perform();
	
	}
	
	public static void clickAndHold(WebElement wb)
	{
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	WebElement wb5=wait.until(ExpectedConditions.visibilityOf(wb));
	
	Actions act=new Actions(driver);
	
	act.clickAndHold(wb5).build().perform();
	
	}
	
	public static void dragAndDrop(WebElement source, WebElement destination)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));	
	WebElement sourcewb= wait.until(ExpectedConditions.visibilityOf(source));
	WebElement destinationwb=wait.until(ExpectedConditions.visibilityOf(destination));
	 Actions act=new Actions(driver);
	 act.dragAndDrop(sourcewb, destinationwb).build().perform();
		
	}
	
	public static void release(WebElement wb)
	{
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb6=wait.until(ExpectedConditions.visibilityOf(wb));
	Actions act=new Actions(driver);
	act.release(wb6).build().perform();
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
    WebElement wb7=	wait.until(ExpectedConditions.visibilityOf(wb));
    Actions act=new Actions(driver);
    act.sendKeys(wb7,value).build().perform();
	}
	
	public static void sendUCText(WebElement wb,String value)
	{
		
	WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb8=wait.until(ExpectedConditions.visibilityOf(wb));
	Actions act=new Actions(driver);
	//act.keyDown(Keys.SHIFT).sendKeys(wb8,value).keyUp(Keys.SHIFT).build().perform();
		
	}
	
	
	
	
	
	
	
	
	
}
