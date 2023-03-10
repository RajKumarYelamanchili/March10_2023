package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTestCases extends TestBase{
	/**
	 * @author RajKumar
	 * FB application testcases
	 */
   
	@Test
	public void TC_001_verifyEmailTxtBox()
	{
		
		boolean isTextPresent =  homePageObj.getEmailTxtBox().isDisplayed();
		System.out.println(isTextPresent);
	}
	
	@Test
	public void TC_002_verifyEmailTxtBox()
	{
		
		boolean isTextPresent =  homePageObj.getEmailTxtBox().isDisplayed();
		Assert.assertTrue(false);
	}

	@Test(timeOut=3000)
	public void TC_003_verifyEmailTxtBox() throws InterruptedException
	{
		
		boolean isTextPresent =  homePageObj.getEmailTxtBox().isDisplayed();
		Thread.sleep(4000);
		Assert.assertTrue(true);
	}

}
