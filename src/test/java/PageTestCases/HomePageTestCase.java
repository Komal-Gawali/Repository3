package PageTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTestCase extends TestBase {

	LoginPage login;
	HomePage home;
	@BeforeTest
	public void setUp() throws Exception {
		enterUrl();
		login = new LoginPage();
		login.verifyloginBtn();
		Thread.sleep(2000);
		home = new HomePage();
	}
	
	@Test
	public void verifyPatientDropTestCase() {
		 boolean actResult = home.verifyPatientDrop();
		 Assert.assertEquals(actResult, true);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
}
