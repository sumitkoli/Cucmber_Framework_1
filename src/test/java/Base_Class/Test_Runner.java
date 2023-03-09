package Base_Class;
import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)

//Feature File Location
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace1\\Cucumber_PageObject_Project\\src\\test\\java\\Feature_Files", 
glue= {"Step_Definition"},

//Result Format in Console
monochrome=true,

//Tags to run specific test
//tags="@Sanity",

//To run the test cases 
dryRun= false,

//Reports path and type
plugin ={"pretty","html:target/HtmlReports/index.html","json:target/JSONReports/cucumber.json","junit:target/JunitReports/cucumber.xml"}


		)

public class Test_Runner extends AbstractTestNGCucumberTests{
//This class will be empty
}
