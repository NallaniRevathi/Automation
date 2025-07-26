package week5Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		WebElement ShopByCat = driver.findElement(By.xpath("(//button[contains(@id,'headlessui-menu-button')])[4]"));
		ShopByCat.click();
		
		Thread.sleep(5000);
		WebElement foodgrainsMO = driver.findElement(By.xpath("//a[@role='none'][normalize-space()='Foodgrains, Oil & Masala']"));
		Actions fgmouse = new Actions(driver);
		fgmouse.moveToElement(foodgrainsMO).perform();
		
		Thread.sleep(5000);
		WebElement riceprodMO = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		Actions riceMouse = new Actions(driver);
		riceMouse.moveToElement(riceprodMO).perform();
		Thread.sleep(5000);
		WebElement boiledSteamedRice = driver.findElement(By.xpath("//a[normalize-space()='Boiled & Steam Rice']"));
		boiledSteamedRice.click();
		Thread.sleep(5000);
		WebElement bbRoyal = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[7]"));
		bbRoyal.click();
		
		Thread.sleep(5000);

		WebElement kgSelbutton = driver.findElement(By.xpath("(//li[@class='PaginateItems___StyledLi2-sc-1yrbjdr-1 kUiNOF'])[3]"));
		kgSelbutton.click();
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("(//div[@class=\"w-40 xl:w-52\"]/following-sibling::div)[1]")).getText();
		Thread.sleep(5000);
		System.out.println("Price of 5kg Rice Bag : " +price);
		
		WebElement Sel5kg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		Sel5kg.click();
		Thread.sleep(5000);
		WebElement clickAdd = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		clickAdd.click();
		Thread.sleep(5000);
		String msg = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		Thread.sleep(5000);
		System.out.println(msg);
		
		driver.close();
		
	}

}