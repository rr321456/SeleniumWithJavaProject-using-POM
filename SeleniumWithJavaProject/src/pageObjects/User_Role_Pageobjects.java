package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Pageobjects {

	@FindBy(xpath = "//ul[@class='oxd-main-menu']//following::li[1]")
	public static WebElement adminlink;
	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	public static WebElement username;
	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	public static WebElement userrole;
	
	@FindBy(xpath ="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
	public static WebElement userstatus;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]")
	public static WebElement userrolevalue;
	
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[5]")
	public static WebElement userstatusvalue;
	
	
}
