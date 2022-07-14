package newkitePOMUsingTestNg;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage1
{

	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	public KitePinPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendPin(String Pin)
	{
		pin.sendKeys(Pin);
	}
	
	public void clickContinueButton()
	{
	
		continueButton.click();
	}
	
	
	
	
}
