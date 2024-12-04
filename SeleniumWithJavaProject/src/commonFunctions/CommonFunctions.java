package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	static Logger logger = Logger.getLogger(CommonFunctions.class);
	
	public Properties loadPropertyFile() throws IOException {
		//load the property file and return it
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");//load log4j
		logger.info("Orange HRM loading");
		logger.info("Loading the propertyfile");
		
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url= properties.getProperty("url");
		String driverlocation = properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			logger.info("Launching Chrome");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			logger.info("Launching Firefox");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		logger.info("Navigating to application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void teardown() {
		logger.info("Execution finished");
		driver.quit();
	}
	
}
