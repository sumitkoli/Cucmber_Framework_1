package Page_Objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	
	
	
	WebDriver ldriver;
	
	public Login_Page(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'SIGN IN')]")
	WebElement signinButton;
	
	@FindBy(tagName = "strong")
	WebElement validationText;

	@FindBy(tagName = "img")
	WebElement logoImg;

	@FindBy(linkText = "Forget Password?")
	WebElement forgotPassword;
	
	public void enterEmail(String emailAdd) {
		email.sendKeys(emailAdd);
	}
	
	public void enterPass(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickonSigninButton() {
		signinButton.click();
	}
	
	//Forgot Password Link
	//	public Forgot_Password_Page clickon_forgotPasswordLink() {
		//	forgotPassword.click();
		//	return new Forgot_Password_Page(ldriver);
	//	}

		// Get the validation Text
		public String get_validationText() {
			return validationText.getText();
		}
		
		//Verifying logo on Login Page
		public Boolean logodisplayed() {
			 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)ldriver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", logoImg);
			return ImagePresent;
		}

}
