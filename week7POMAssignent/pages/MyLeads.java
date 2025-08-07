package pages;
import org.openqa.selenium.By;

import baseclass.BaseClass;
public class MyLeads extends BaseClass {
	public CreateLead leadpage() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}
}