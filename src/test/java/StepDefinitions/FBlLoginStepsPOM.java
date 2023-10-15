package StepDefinitions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBlLoginStepsPOM{
 WebDriver driver=null;
 LoginPage login;
 
@Before
public void setUpDriver() {
	String projectpath=System.getProperty("user.dir");
	System.out.println("projectpath: "+projectpath);
	System.setProperty("webdriver.chome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

}
	
	@Given("user is in FB login page")
	public void user_is_on_fb_login_page() throws InterruptedException {
	   driver.navigate().to("https://www.facebook.com/login/");
	  
	}
	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
   
		login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLoginButton();
	}
	
	@Then("user is navigate to FBHome Page Successfully")
	public void user_is_navigate_the_fb_home_page() {
	 driver.getPageSource().contains("Facebook");
	 Assert.assertEquals("Live video", "Live video");
	 driver.close();
	 driver.quit();
	}
}
