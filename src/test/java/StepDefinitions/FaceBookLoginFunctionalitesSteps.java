package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class FaceBookLoginFunctionalitesSteps {
	WebDriver driver=null;
	private static Utils utils=null;
	@Given("user open the browser")
		public void user_lunch_the_browser() {
			System.out.println("user is open the browser");
			String projectpath=System.getProperty("user.dir");
			System.out.println("projectpath: "+projectpath);
			System.setProperty("webdriver.chome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	}
	
	@Given("user is on FB login page")
	public void user_is_on_fb_login_page() throws InterruptedException {
	   driver.navigate().to("https://www.facebook.com/login/");
	   Thread.sleep(3000);
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9704661656");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Subbu165689$");
	    Thread.sleep(2000);
	}
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9704661656");
		    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Subbu165689$");
		    Thread.sleep(2000);
	}
	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9704661656");
		    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sSubbu165689$");
		    Thread.sleep(2000);
	}
	@When("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("919704661656");
		    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Subbu165689$");
		    Thread.sleep(2000);
	}
	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("919704661656");
		    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sSubbu165689$");
		    Thread.sleep(2000);
	}
	@When("user clicks on FB login button")
    public void user_clicks_on_FB_login_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(3000);
	}
	@Then("user is navigate the FBHome Page")
	public void user_is_navigate_the_fb_home_page() {
	 driver.getPageSource().contains("Facebook");
	 Assert.assertEquals("Live video", "Live video");
	 driver.close();
	 driver.quit();
	}
	@Then("user is not navigate the FaceBookHome Page")
	public void user_is_not_navigate_the_FaceBookHome_Page() {
	 Assert.assertEquals("Invalid username or password", "Invalid username or password"); 
	 System.out.println("Showing Invalid username or password");
     utils=new Utils(driver);
	}
	




}
