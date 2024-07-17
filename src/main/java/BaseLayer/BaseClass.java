package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass()
	{
		
File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigurationLayer\\OrangeHRM.properties");
		
try {
	 fis=new FileInputStream(f)	;
	  prop=new Properties();
	  try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	}
 public static void initialization()
 {
	 
	// Connect to the actual browser by using selenium code
			// System.setProperty("webdriver.chrome.driver",
			// System.getProperty("user.dir")+"\\AllDriversFolder\\chromedriver.exe");

			// Up casting concept
			driver = new EdgeDriver();

			// Maximize the browser
			driver.manage().window().maximize();

			// implicitWait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			// pageLoadTimeout
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

			// deleteAllCookies
			driver.manage().deleteAllCookies();

			
			//use getProperty() method to open URL
			
			String url=prop.getProperty("URL");
			
			
			// Open URL
			driver.get(url);


 }
		

}
