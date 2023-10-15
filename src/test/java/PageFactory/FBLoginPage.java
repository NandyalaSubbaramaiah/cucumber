package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

	@FindBy(id = "email")
	WebElement txt_username;
	
	@FindBy(name="pass")
	WebElement txt_password;
	
	@FindBy(name="login")
	WebElement login;
	
	WebDriver driver;
	
	public FBLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clickOnLoginPage() {
		login.click();
	}
}
