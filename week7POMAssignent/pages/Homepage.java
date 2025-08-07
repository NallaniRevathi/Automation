package pages;
import org.openqa.selenium.By;

import baseclass.BaseClass;
public class Homepage extends BaseClass{
	public MyLeads myLeads() {
		driver.findElement(By.linkText("Leads")).click();
		
		return new MyLeads();
	}
}
