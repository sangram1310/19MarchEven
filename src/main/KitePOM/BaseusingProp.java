package kiteBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import kiteUtility.Utility;
import kiteUtility.UtilityUseProp;

public class BaseusingProp {
protected static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\java folder\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
	    driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(UtilityUseProp.getDataFromPropertyFile("URL"));
}
}