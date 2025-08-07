package pages;
import org.openqa.selenium.By;

import baseclass.BaseClass;

//import baseclass.BaseClass;
public class Login extends BaseClass{
	
	public Login enterUname() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		/*
		 * login lp=new login(); return lp;
		 */
		return this;
		
		
	}
	public Login enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
		
	}

}

