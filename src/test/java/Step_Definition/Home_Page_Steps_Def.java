package Step_Definition;

import Base_Class.Base_Class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Home_Page_Steps_Def extends Base_Class {

	@Then("Page Tittle should be {string}")
	public void page_tittle_should_be(String expectedtitle) {
		String actualtitle = driver.getTitle();

		Assert.assertEquals(expectedtitle, actualtitle);
	}

	@When("User click on logout Button")
	public void user_click_on_logout_button() throws InterruptedException {
		homePg.clickonProfile();
		homePg.clickonLogoutBtn();
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

		String expected = event_page.page_Header();
		Assert.assertEquals(expected, actual);
	}

	@Then("Header should be {string}")
	public void header_should_be(String actual1) {

		String expected1 = create_event.Event_WidgetHeader();
		Assert.assertEquals(expected1, actual1);
	}
}
