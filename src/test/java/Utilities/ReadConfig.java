package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	String path="C:\\Users\\lenovo\\eclipse-workspace1\\Cucumber_PageObject_Project\\src\\main\\resource\\config.properties";
	
	public ReadConfig() throws IOException {
		properties=new Properties();
		
		FileInputStream fis=new FileInputStream(path);
		
		properties.load(fis);
	}
	
	public String getbrowser() {
		String value=properties.getProperty("browser");
		
		if(value!=null) {
			return value;
		}else
			throw new RuntimeException("Browser not specified in Config File.");
		
	}
}
