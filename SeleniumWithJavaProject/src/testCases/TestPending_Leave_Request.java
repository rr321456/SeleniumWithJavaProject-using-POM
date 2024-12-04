package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Dashboard_Pageobjects;
import pageObjects.Login_Pageobjects;

public class TestPending_Leave_Request extends CommonFunctions {

	
	String actualmessage=null;
	
	static Logger logger= Logger.getLogger(TestPending_Leave_Request.class);
	public void login() {
		
		logger.info("Login into the application");
		PageFactory.initElements(driver, Login_Pageobjects.class);
		Login_Pageobjects.userName.sendKeys(properties.getProperty("username"));
		Login_Pageobjects.passWord.sendKeys(properties.getProperty("password"));
		Login_Pageobjects.loginBUtton.click();
	} 
	
	public void getpendingleaverequest() {
		
		PageFactory.initElements(driver, Dashboard_Pageobjects.class);
		actualmessage = Dashboard_Pageobjects.pendingleaverequests.getText();
		System.out.println(actualmessage);
	}
	
	@Test
	public void verifyPendingLeaveRequests() {
		login();
		logger.info("Getting the pending leave request");
		getpendingleaverequest();
		
		logger.info("Verification");
		if(actualmessage.equalsIgnoreCase("No Employees are on Leave Today")) {
			logger.info("No Employees are on Leave Today");
		}else {
			logger.info(actualmessage +"leave on today");
		}
		logger.info("End of Pending leave request test case");
	}
}
