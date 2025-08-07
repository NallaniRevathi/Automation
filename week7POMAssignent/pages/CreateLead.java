package pages;
import org.openqa.selenium.By;

import baseclass.BaseClass;
public class CreateLead extends BaseClass {
	public ViewLeads createlead()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeads();
	}
}
