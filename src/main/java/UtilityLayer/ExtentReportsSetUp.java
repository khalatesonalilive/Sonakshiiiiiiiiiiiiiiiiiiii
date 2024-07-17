package UtilityLayer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportsSetUp extends BaseClass
{

	public static ExtentReports setUp(String suiteName)
	{
		
		ExtentReports extentReports=new ExtentReports();
		
	String path=	System.getProperty("user.dir")+"\\ExtentHTMLReports\\"+suiteName+date()+".html";
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(path);
		extentReports.attachReporter(extentSparkReporter);
		return extentReports;
	}
	
	public static String screenshot(String foldername,String testCaseName)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);
	
   String destination=	System.getProperty("user.dir")+"\\"+foldername+"\\"+testCaseName+date()+".png";
		
		return destination;
		
	}
	
	public static String date()
	{
		SimpleDateFormat s=new SimpleDateFormat("ddMMyyyy_HHmmss");
	String date=	s.format(new Date());
	return date;
		
	}
	
	
	
}
