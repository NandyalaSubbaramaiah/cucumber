package StepDefinitions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class GoogleSearchSteps {
WebDriver driver=null;
private static Utils utils=null;
@Given("user lunch the browser")
public void user_lunch_the_browser() {
	System.out.println("user is open the browser");
	String projectpath=System.getProperty("user.dir");
	System.out.println("projectpath: "+projectpath);
	System.setProperty("webdriver.chome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}

@When("user open used google search page URL")
public void user_enter_some_text() {
    driver.navigate().to("https://www.google.com/");
}

@When("user search some text on the google searchbox")
public void search_some_text_on_the_searchbox() throws InterruptedException {
   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Sky news live");
   Thread.sleep(3000);
   
}
@And("user hits search box")
public void clicks_on_login_button() throws InterruptedException {
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
}
@Then("user navigate the search results")
public void navigate_the_information_about_the_text() throws InterruptedException {
   driver.getPageSource().contains("Watch Sky News Live");
   Thread.sleep(3000);
   utils=new Utils(driver);
}

	
	



}
