package Base_Class;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

//Feature File Location
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace1\\Cucumber_PageObject_Project\\src\\test\\java\\Feature_Files", glue= {"Step_Definition"},

//Result Format in Console
monochrome=true,

//tags= {"@LoginTest"},

//Reports path and type
plugin ={"pretty","html:target/HtmlReports/index.html","json:target/JSONReports/cucumber.json","junit:target/JunitReports/cucumber.xml"}


		)

public class Test_Runner {

}
