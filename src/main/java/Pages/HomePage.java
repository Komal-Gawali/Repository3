package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;

public class HomePage extends TestBase{

	
//	oR
	@FindBy(xpath = "//div[text()='Patient']") private WebElement patientDropDown;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
//	To verify patient dropdown
	public boolean verifyPatientDrop() {
		 return patientDropDown.isDisplayed();
	}
	
	
}
