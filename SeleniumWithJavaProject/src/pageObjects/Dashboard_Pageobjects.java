package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Pageobjects {

	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[5]/div/div[2]/div[1]/div[2]/p[1]")
	public static WebElement pendingleaverequests;
}
