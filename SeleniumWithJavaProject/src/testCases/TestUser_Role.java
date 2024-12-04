package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.User_Role_Pageobjects;

public class TestUser_Role extends CommonFunctions {
	
	static Logger logger= Logger.getLogger(TestUser_Role.class);
	public void movetouserpage() {
		
		User_Role_Pageobjects.adminlink.click();
	}
	
	public void selectuserrole()  {
		
		User_Role_Pageobjects.userrole.sendKeys("a"+ Keys.ENTER);
		
		  
	/* action.sendKeys("a"); action.click().build().perform(); */
		 
		 
	}
	
	public void selectuserstatus() {

		User_Role_Pageobjects.userstatus.sendKeys("e" + Keys.ENTER);
		
	}
	
	@Test
	public void checkuserrole()  {
		
		PageFactory.initElements(driver, User_Role_Pageobjects.class);
		logger.info("Navigating to Users Page");
		movetouserpage();
		logger.info("Selecting the User Role");
		selectuserrole();
		logger.info("Selecting the User Status");
		selectuserstatus();
		
		User_Role_Pageobjects.searchbutton.sendKeys(Keys.ENTER);
		
		
		String actualrole = User_Role_Pageobjects.userrolevalue.getText(); String
		actualstatus= User_Role_Pageobjects.userstatusvalue.getText();
		
		logger.info("Verifying the users");  
		Assert.assertEquals(actualrole, "Admin");
		Assert.assertEquals(actualstatus,"Enabled");
		logger.info("End of the User Role test case");
		 
	}

}
