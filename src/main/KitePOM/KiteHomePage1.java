package newkitePOMUsingTestNg;

import java.sql.Driver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KiteHomePage1 
{

	@FindBy(xpath = "//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	public KiteHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
		public String getActualuserName	()
		{
		
			String actualuserName = userName.getText();
			return actualuserName;
			
			
//			String expecteduserName = ExpUserId;
//			String actualuserName = userName.getText();
//			
//			if(expecteduserName.equals(actualuserName))
//			{
//				System.out.println("Actual And Expected Userid Matching Tc is Passed");
//			}
//			
//			else
//			{
//				System.out.println("Actual And Expected Userid Not Matching Tc is Failed");
			//}
		}
		
	public void clicklogoutButton() throws InterruptedException
	{
		userName.click();
		Thread.sleep(1000);
		logoutButton.click();
	}
	
	
}
