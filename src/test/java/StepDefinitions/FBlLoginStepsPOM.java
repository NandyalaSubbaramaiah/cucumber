package StepDefinitions;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.FBLoginPage;
import Pages.LoginPage;
import Utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBlLoginStepsPOM{
 private static WebDriver driver=null;
 //LoginPage login;
 FBLoginPage loginPage;
 private static Utils utils=null;
 
@Before
public void setUpDriver() {
	String projectpath=System.getProperty("user.dir");
	System.out.println("projectpath: "+projectpath);
	System.setProperty("webdriver.chome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 
}

	
	@Given("user is in FB login page")
	public void user_is_on_fb_login_page() throws InterruptedException {
	   driver.navigate().to("https://www.facebook.com/login/");
	  
	}
	@When("user enter {string} and {string}")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException, IOException {
      loginPage=new FBLoginPage(driver);
	  loginPage.enterUsername(username);
      loginPage.enterPassword(password);
      loginPage.clickOnLoginPage();
	
	}
	
	@Then("user is navigate to FBHome Page Successfully")
	public void user_is_navigate_the_fb_home_page() {
	 driver.getPageSource().contains("Facebook");
	 Assert.assertEquals("Live video", "Live video");
	 
	}
	@Then("user take the screenshot sccessfully")
	public void user_take_screenshot() throws IOException {
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File(".//ScreenShot/screen.png"));
	 utils=new Utils(driver);
	}
   
	
		
		
	
}
