package week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AccountSelect {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		// click on leads
		driver.findElement(By.linkText("Accounts")).click();
		// click on create lead
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Shiva");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");

		WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
		Select sel = new Select(sourceDD);
		sel.selectByIndex(3);

		WebElement sourceDD1 = driver.findElement(By.name("ownershipEnumId"));
		Select sel1 = new Select(sourceDD1);
		sel1.selectByVisibleText("S-Corporation");

		WebElement sourceDD2 = driver.findElement(By.id("dataSourceId"));
		Select sel2 = new Select(sourceDD2);
		sel2.selectByValue("LEAD_EMPLOYEE");

		WebElement sourceDD3 = driver.findElement(By.id("marketingCampaignId"));
		Select sel3 = new Select(sourceDD3);
		sel3.selectByIndex(6);

		driver.findElement(By.className("boxhead")).click();

		WebElement sourceDD4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4 = new Select(sourceDD4);
		sel4.selectByValue("TX");

		String expectedname = "Shiva";

		driver.findElement(By.className("smallSubmit")).click();

		System.out.println(driver.getTitle());

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Shiva')]"));
		String actualname = element.getText();
		if (actualname.contains(expectedname)) {
			System.out.println("The account name is displayed correctly");

		} else {
			System.out.println("The account name is not displayed correctly");

		}
		driver.close();

	}

}
