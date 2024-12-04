package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Pageobjects {

	@FindBy(xpath = "//input[@name='username']")
	public static WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginBUtton; 
}
