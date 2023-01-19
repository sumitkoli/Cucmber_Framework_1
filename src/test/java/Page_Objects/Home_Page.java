package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	
WebDriver ldriver;
	
	public Home_Page(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="userProfileDropdown")
	WebElement profile;
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	WebElement Logoutbtn;
	
	@FindBy(xpath="//span[text()='Event Category']")
	WebElement EventCategoryTab;
	
	public void clickonProfile() throws InterruptedException {
		Thread.sleep(4000);
		profile.click();
	}
	
	public void clickonLogoutBtn() {
		Logoutbtn.click();
	}
	
	public void clickonEventCategoryTab() throws InterruptedException {
		Thread.sleep(3000);
		EventCategoryTab.click();
	}
	
}
