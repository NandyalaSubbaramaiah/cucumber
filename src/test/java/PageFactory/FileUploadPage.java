package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@class='form-control required File']")
	WebElement filename;
	
	@FindBy(xpath ="//input[@id='candidate_name']")
	WebElement txt_Fullname;
	
	@FindBy(xpath = "//input[@id='candidate_email']")
	WebElement txt_email;
	
	@FindBy(xpath = "//input[@id='iagree']")
	WebElement txt_Policy_checkbox;
	
	@FindBy(xpath = "//input[@id='termscon']")
	WebElement txt_check_Terms_Conditions;
	
	public FileUploadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ChooseName(String fullname) {
		txt_Fullname.sendKeys(fullname);
		
	}
	public void Chooseemail(String ChooseEmail) {
		txt_email.sendKeys(ChooseEmail);
		
	}
	public void ChooseFilename(String Choosefilename) {
		filename.sendKeys(Choosefilename);
		
	}
	public void ChoosePolicy(String ChoosePolocy) {
		filename.sendKeys(ChoosePolocy);
		
	}public void ChooseTermsConditions(String ChooseTermsConditions) {
		filename.sendKeys(ChooseTermsConditions);
		
	}
}
