package newkitePOMUsingTestNg;

import java.sql.Driver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{
	//variable diclaration
   @FindBy(id="userid")private WebElement userName;
   @FindBy(id="password")private WebElement password;
   @FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
   
   
   //constructor
   public KiteLoginPage1(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   //method
   
   public void senduserName(String UserName)
   {
	userName.sendKeys(UserName);
   }
   public void sendpassword(String Password)
   {
	password.sendKeys(Password);
   }
   public void clickLoginbutton() 
   {
	loginButton.click();
}
   
   
}
