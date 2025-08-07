package pages;
import org.openqa.selenium.By;

import baseclass.BaseClass;

public class WelcomePage extends BaseClass {
	public Homepage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new Homepage();
	}
	}
