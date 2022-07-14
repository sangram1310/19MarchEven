package KiteTest;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteBase.Base;
import kiteUtility.Utility;
import kiteUtility.UtilityUseProp;
import newkitePOMUsingTestNg.KiteHomePage1;
import newkitePOMUsingTestNg.KiteLoginPage1;
import newkitePOMUsingTestNg.KitePinPage1;
@li
public class ValidateUserIDUseProp extends Base {
	KiteHomePage1 home;
	KiteLoginPage1 login;
	KitePinPage1 pin;
	//String TCID ="773";
	@BeforeClass
	public void launchbrowser()
	{
		openBrowser();
		login= new KiteLoginPage1(driver);
		pin=new KitePinPage1(driver);
		home= new KiteHomePage1(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException 
	{
	  login.senduserName(UtilityUseProp.getDataFromPropertyFile("UN"));
	  login.sendpassword(UtilityUseProp.getDataFromPropertyFile("PWD"));
	  login.clickLoginbutton();
	  pin.sendPin(UtilityUseProp.getDataFromPropertyFile("PIN"));
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	}
	
	
	@Test
  public void validateKiteUserID() throws EncryptedDocumentException, IOException
  {
		
	  Assert.assertEquals(home.getActualuserName(),UtilityUseProp.getDataFromPropertyFile("UN"),"actule and Expected UserID not Matching TC failed");
	 // UtilityUseProp.captureScreenShot(driver, TCID);
  }
	
	@AfterMethod
	public void logOutFromKiteApp() throws InterruptedException
	{
		home.clicklogoutButton();
	}
	@AfterClass
	public void closeBroser()
	{
		driver.close();
	}
	
	
	
	
}
