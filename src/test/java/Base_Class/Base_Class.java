package Base_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page_Objects.Create_Event_Category_Page;
import Page_Objects.Event_Category_Page;
import Page_Objects.Home_Page;
import Page_Objects.Login_Page;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	public static Login_Page loginPg;
	public static Home_Page homePg;
	public static Event_Category_Page event_page;
	public static Create_Event_Category_Page create_event;
	public static Logger log;
	public static ReadConfig readconfig;
	public String browser;

	public void setup() throws IOException {
		readconfig = new ReadConfig();
		log = LogManager.getLogger("Logs");

		browser = readconfig.getbrowser();

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome Browser Started Successfully");
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Firefox Browser Started Successfully");
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			log.info("Edge Browser Started Successfully");
			break;

		default:
			driver = null;
			break;
		}

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		loginPg = new Login_Page(driver);
		homePg = new Home_Page(driver);
		event_page = new Event_Category_Page(driver);
		create_event = new Create_Event_Category_Page(driver);
	}

	public void teardown() {
		driver.quit();
		log.info("Browser Closed Successfully");
	}

}
