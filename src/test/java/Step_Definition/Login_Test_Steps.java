package Step_Definition;

import java.io.IOException;
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
	public void the_browser_is_open() throws IOException {
		setup();

	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
		driver.get(url);
	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginPg.enterEmail(emailadd);
		log.info("UserName is Entered");
		loginPg.enterPass(password);
		log.info("Password is Entered");

	}

	@And("Click on Sign In")
	public void click_on_sign_in() {
		loginPg.clickonSigninButton();
		log.info("Sign In Button is clicked");
	}

	@Then("close the browser")
	public void close_the_browser() {
		teardown();
	}

	@Then("Validations message is displayed for valid username and invalid password")
	public void validations_message_is_displayed_for_valid_username_and_invalid_password() {

		String actual = loginPg.get_validationText();
		String expected = "Wrong password";

		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		log.info("Login Unsuccessfull");
	}

	@Then("Validations message is displayed for invalid username and valid password")
	public void validations_message_is_displayed_for_invalid_username_and_valid_password() {
		String actual = loginPg.get_validationText();
		String expected = "Admin does not exist";

		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		log.info("Login Unsuccessfull");
	}
	
	@Then("Validations message is displayed for invalid username and invalid password")
	public void validations_message_is_displayed_for_invalid_username_and_invalid_password() {
		String actual = loginPg.get_validationText();
		String expected = "Admin does not exist";

		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		log.info("Login Unsuccessfull");
	}

	@Then("Validations message is displayed for blank username and valid password")
	public void validations_message_is_displayed_for_blank_username_and_valid_password() {
		String actual = loginPg.get_validationText();
		String expected = "Please fill all fields";

		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		log.info("Login Unsuccessfull");
	}

	@Then("Validations message is displayed for valid username and blank password")
	public void validations_message_is_displayed_for_valid_username_and_blank_password() {
		String actual = loginPg.get_validationText();
		String expected = "Please fill all fields";

		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		log.info("Login Unsuccessfull");
	}

	@Then("Validations message is displayed for blank username and blank password")
	public void validations_message_is_displayed_for_blank_username_and_blank_password() {
		String actual = loginPg.get_validationText();
		String expected = "Please fill all fields";

		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		log.info("Login Unsuccessfull");
	}
}
