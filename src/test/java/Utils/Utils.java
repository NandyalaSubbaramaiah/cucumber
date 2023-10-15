package Utils;

import org.openqa.selenium.WebDriver;

public class Utils {
WebDriver driver;
	public Utils(WebDriver driver) {
		driver.close();
		driver.quit();
	}

}
