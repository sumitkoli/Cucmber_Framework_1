package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Event_Category_Page {

	
WebDriver ldriver;
	
	public Event_Category_Page(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement addEventCategorybtn;
	
	@FindBy(xpath="//div[@class=\"page-header\"]")
	WebElement Page_Header;
	
	public void clickonAddEventCategory_Btn() {
		addEventCategorybtn.click();
	}
	
	public String page_Header() {
		
		return Page_Header.getText();
	}
}
