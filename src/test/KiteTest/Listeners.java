package KiteTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.Base;
import kiteBase.BaseusingProp;
import kiteUtility.UtilityUseProp;

public class Listeners extends BaseusingProp implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		try {
			UtilityUseProp.captureScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC Pssed And TC Name Is"+result.getName(),true);
	}
}
