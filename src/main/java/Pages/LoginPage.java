package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

//	Object Repository
	@FindBy(xpath = "//*[@id=\"login_form\"]") private WebElement logoOEMR;
	@FindBy(xpath = "//p[@class='text-center text-white lead']") private WebElement infoAOEMR;
	@FindBy(xpath = "//a[@class='text-white']") private WebElement links;
	@FindBy(xpath = "//input[@id='authUser']") private WebElement usernameTextbox;
	@FindBy(xpath = "//input[@id='clearPass']") private WebElement passwordTextbox;
	@FindBy(xpath = "//select[@name='languageChoice']") private WebElement langListDrop;
	@FindBy(xpath = "//button[@id='login-button']") private WebElement loginBtn;
	
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
//	verify url
	public String verifyCurrentUrl() {
		return driver.getCurrentUrl();
	}
//	verify title
	public String verifyTitle() {
		return driver.getTitle();
	}
//	verify logo 
	public boolean verifyLogo() {
		return logoOEMR.isDisplayed();
	}
//	verify info about OpenEMR
	public String verifyInfo() {
		   return infoAOEMR.getText();
	}
//	verify present links 
	public String verifyLinks() {
		   return links.getText();
	}
	
//	verify username textbox
	public void verifyUsernameTextbox() {
		 usernameTextbox.click();
		 usernameTextbox.sendKeys("admin");
		 
	}
	
//	Verify password textbox
	public void verifyPasswordTextbox() {
		passwordTextbox.click();
		passwordTextbox.sendKeys("pass");
	}
	
//	verify language list dropdown
	public String verifyLangList() {
		langListDrop.isDisplayed();
		return langListDrop.getText();
	}
	
//	verify login btn
	public void verifyloginBtn() {
		 usernameTextbox.sendKeys("admin");
		 passwordTextbox.sendKeys("pass");
		loginBtn.click();
	}
	
	
	
	
}
