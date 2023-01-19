package Base_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Objects.Create_Event_Category_Page;
import Page_Objects.Event_Category_Page;
import Page_Objects.Home_Page;
import Page_Objects.Login_Page;

public class Base_Class {
	public WebDriver driver;
	public Login_Page loginPg;
	public Home_Page homePg;
	public Event_Category_Page event_page;
	public Create_Event_Category_Page create_event;
	
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		    
		    driver=new ChromeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    
		    driver.manage().window().maximize();
		    
		    loginPg=new Login_Page(driver);
		    homePg=new Home_Page(driver);
		    event_page=new Event_Category_Page(driver);
		    create_event=new Create_Event_Category_Page(driver);
	}
	
	public void teardown()
	{
		driver.quit();
	}

}
