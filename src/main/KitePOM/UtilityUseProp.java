package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityUseProp 
{
   public static String getDataFromPropertyFile(String key) throws IOException
   {
	   Properties prop=new Properties();
	   FileInputStream myfile = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\19MarchEven\\MyPropertiesFile.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
   }
	public static void captureScreenShot (WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\OneDrive\\Pictures\\Screenshot\\newScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}
}
