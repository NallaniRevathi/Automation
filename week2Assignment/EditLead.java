package week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		// click on leads
		driver.findElement(By.linkText("Leads")).click();
		// click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeeafs6");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nallani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Revathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("RevathiS");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathi.nallani@gmail.com");
		WebElement sourceDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel = new Select(sourceDD);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Welcome to TestLeafs");
		//desc.clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		//driver.close();

	}

}
