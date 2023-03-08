package PageTestCases;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTestCases extends TestBase {

	LoginPage login;
	@BeforeTest
	public void startup() {
		enterUrl();
		login = new LoginPage();
	}
	@Test
	public void verifyCurrentUrlTestCase() throws Exception  {
		String acturl = login.verifyCurrentUrl();
		String ectUrl = "https://demo.openemr.io/a/openemr/interface/login/login.php?site=default";
		Assert.assertEquals(ectUrl, acturl);
		Reporter.log(acturl);
	}
	
	@Test
	public void verifyTitleTestCase() {
		   String actTitle = login.verifyTitle();
		   String exptitle = "OpenEMR Login";
		   Assert.assertEquals(exptitle, actTitle);
		   Reporter.log(actTitle);
	}
	
	@Test
	public void verifyLogoTestCase() {
		boolean actLogo = login.verifyLogo();
		Assert.assertEquals(actLogo, true);
	}
	
	@Test
	public void verifyInfoTestCase() {
		 String actinfo = login.verifyInfo();
		 String extInfo = "The most popular open-source Electronic Health Record and Medical Practice Management solution.";
		 Assert.assertEquals(extInfo, actinfo);
		 Reporter.log(actinfo);
	}
	
	@Test
	public void verifyLinksTestCase() {
		   String actLink = login.verifyLinks();
		   String expLink = "Acknowledgments, Licensing and Certification";
		   Assert.assertEquals(expLink, actLink);
		   Reporter.log(actLink);
	}
	
	@Test
	public void verifyUsernameTextboxTestCase() {
		 login.verifyUsernameTextbox();
	}
	
	@Test
	public void verifyPasswordTextboxTestCase() {
		login.verifyPasswordTextbox();
	}
	
	@Test
	public void verifyLangListTestCase() {
	       login.verifyLangList();
	}
	@Test // (dependsOnMethods = {"verifyUsernameTextboxTestCase", "verifyPasswordTextboxTestCase"})
	public void verifyloginBtnTestCase() {
		login.verifyloginBtn();
		Reporter.log(driver.getCurrentUrl());
	}
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
}
