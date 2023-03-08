package PageTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.BasicHomePage;
import Pages.LoginPage;

public class BasicHomePageTestCases extends TestBase {

	BasicHomePage homeP;
	LoginPage login;
	@BeforeTest
	public void newpage() throws Exception {
		enterUrl();
		login = new LoginPage();
		login.verifyloginBtn();
		Thread.sleep(2000);
	     homeP = new BasicHomePage();
	}
	
	@Test
	public void verifyCurrentUrlTestCase() {
//		login.verifyloginBtn();
		 String actUrl = homeP.verifyCurrentUrl();
//		 String expUrl = "https://demo.openemr.io/a/openemr/interface/main/tabs/main.php?token_main=Zm9wUOYFv2xz5jpTwT8RXZveVWioQdAWBXP1EWQW";
//		 Assert.assertEquals(expUrl, actUrl);
		Reporter.log(actUrl);
	}
	
	@Test
	public void verifyCalendarDateTestCase() {
		  boolean actResult = homeP.verifyCalendarDate();
		  Assert.assertEquals(actResult, true);
	}
	
	@Test
	public void verifyMassageCenterTestcase() {
		  boolean actResult = homeP.verifyMassageCenter();
		  Assert.assertEquals(actResult, true);
	}
	
	
	
	
	
	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	
	
}
