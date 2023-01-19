package Step_Definition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_Class.Base_Class;
import Page_Objects.Create_Event_Category_Page;
import Page_Objects.Event_Category_Page;
import Page_Objects.Home_Page;
import Page_Objects.Login_Page;
import io.cucumber.java.en.*;
import junit.framework.Assert;


public class Login_Test_Steps extends Base_Class {
	
	
	@Given("the browser is open")
	public void the_browser_is_open() {
		setup();
		
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
	    driver.get(url);
	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginPg.enterEmail(emailadd);
		loginPg.enterPass(password);
	 
	}

	@And("Click on Sign In")
	public void click_on_sign_in() {
	    loginPg.clickonSigninButton();
	}

	@Then("Page Tittle should be {string}")
	public void page_tittle_should_be(String expectedtitle) {
	   String actualtitle= driver.getTitle();
	   
	   Assert.assertEquals(expectedtitle, actualtitle);
	}

	@When("User click on logout Button")
	public void user_click_on_logout_button() throws InterruptedException {
		homePg.clickonProfile();
	    homePg.clickonLogoutBtn();
	}

	@Then("close the browser")
	public void close_the_browser() {
	   teardown();
	}

	
	@And("Click on Event Category Tab")
	public void click_on_event_category_tab() throws InterruptedException {
		homePg.clickonEventCategoryTab();
	   
	}

	@And("Click on Add Event Category Button")
	public void click_on_add_event_category_button() {
	   event_page.clickonAddEventCategory_Btn();
	}

	@And("Enter enter Event Name {string} and Status as {string}")
	public void enter_enter_event_name_and_status_as(String EventName, String EventStatus) {
	   create_event.enterEvent_Name(EventName);
	   create_event.selectEvent_Status(EventStatus);
	  
	}

	@And("Click on Save")
	public void click_on_save() {
		 create_event.clickon_Savebtn();
	}
	
	@Then("Page Header should be {string}")
	public void page_header_should_be(String actual) {
		
		String expected= event_page.page_Header();
	    Assert.assertEquals(expected, actual);
	}

	@Then("Header should be {string}")
	public void header_should_be(String actual1) {
		
		String expected1 = create_event.Event_WidgetHeader();
	   Assert.assertEquals(expected1, actual1);
	}
}
