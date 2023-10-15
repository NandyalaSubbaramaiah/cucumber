package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.FileUploadPage;
import Utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FileUploadSteps {
	private static WebDriver driver=null;
	private static FileUploadPage fileuploadpage;
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
	
	
	@Given("user is on website")
	public void user_is_on_google_drive_page() {
		driver.navigate().to("https://nityo.com/upload-cv/MTE4Mzg=/c2hyaXlhLlNNQGJoYXZ5YW5zaC5pbg==");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	
	
	@When("user upload a {string} in website")
	public void user_upload_a_file(String Choosefilename) {
		fileuploadpage=new FileUploadPage(driver);
		String filepath="C:\\Users\\User\\Documents\\Nandyala Subbaramaiah.docx";
		fileuploadpage.ChooseFilename(filepath);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	@When("user enter as {string}")
	public void username(String fullname) {
		fileuploadpage=new FileUploadPage(driver);
		fileuploadpage.ChooseName(fullname);	
	}
	@When("user enter input as {string}")
	public void Email(String ChooseEmail) {
		fileuploadpage.Chooseemail(ChooseEmail);

		
	}
	
	@When("user click the checkbox policy")
	public void user_click_the_checkbox_policy(String ChoosePolicy) {
	   fileuploadpage.ChoosePolicy(ChoosePolicy);
	}

	@When("user click the terms and condition checkbox")
	public void user_click_the_terms_and_condition_checkbox(String ChooseTermsConditions) {
	   fileuploadpage.ChooseTermsConditions(ChooseTermsConditions);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	@After	
	public void treardown() throws IOException{
		utils=new Utils(driver);
		
	}




}
