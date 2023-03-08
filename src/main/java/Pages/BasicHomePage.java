package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class BasicHomePage extends TestBase {
	
//	Object Repository
	@FindBy(xpath = "//span[@class='tabTitle pr-2']") private WebElement calendarDatepicker;
	@FindBy(xpath = "//span[@class='tabTitle pr-2 tabHidden']") private WebElement msgCenter;
	
	
	public BasicHomePage() {
		PageFactory.initElements(driver, this);
	}
	
//	verify url
	public String verifyCurrentUrl() {
		 return driver.getCurrentUrl();
	}
	
//	verify calendar date picker
	public boolean verifyCalendarDate() {
		return calendarDatepicker.isDisplayed();
	}
	
//	verify massage center
	public boolean verifyMassageCenter() {
		return msgCenter.isEnabled();
	}
	
	
	
	
	
	
	
	

}
