package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Event_Category_Page {

	
WebDriver ldriver;
	
	public Create_Event_Category_Page(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='event_category_name']")
	WebElement eventName;
	
	@FindBy(xpath="//select[@id='status']")
	WebElement EventStatus;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Savebtn;
	
	@FindBy(xpath="//div[@class=\"widget-header\"]")
	WebElement Event_Widgetheader;
	
	public void enterEvent_Name(String EventName) {
		eventName.sendKeys(EventName);
	}
	
	public void selectEvent_Status(String Status) {
		
		Select eventStatus=new Select(EventStatus);
		eventStatus.selectByVisibleText(Status);
	}
	
	public void clickon_Savebtn() {
		Savebtn.click();
	}
	
	public String Event_WidgetHeader() {
		
		return Event_Widgetheader.getText();
	}
}
