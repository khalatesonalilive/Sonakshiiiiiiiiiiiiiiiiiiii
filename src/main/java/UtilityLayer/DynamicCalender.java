package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DynamicCalender extends BaseClass{

	
	public static By by(String tagName,String date)	
	{
		
	return	By.xpath("\\"+tagName+"[text()='"+date+ "']");
		
	}
		
		public static void dynamicCalender(WebElement MonthYearWb,String ExpectedMonthYear,String tagName,
				String date,WebElement next)
		
		{
			while(true)
			{
				String actualMonthYear=	MonthYearWb.getText();
				
				if(actualMonthYear.contains(ExpectedMonthYear))
				{
					driver.findElement(by(tagName,date)).click();
					break;
					
				}
				else
				{
					next.click();
				}
				
			}
		
			
			
			
			
		}
		
	
	
	
}
