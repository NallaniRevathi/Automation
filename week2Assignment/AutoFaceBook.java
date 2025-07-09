package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoFaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nallani");
		driver.findElement(By.name("lastname")).sendKeys("Revathi");
		driver.findElement(By.name("reg_email__")).sendKeys("9962905569");
		driver.findElement(By.id("password_step_input")).sendKeys("RevathiShiva");
		
		WebElement date=driver.findElement(By.id("day"));
		Select selDate= new Select(date);
		selDate.selectByValue("23");
		
		WebElement month=driver.findElement(By.id("month"));
		Select selMonth= new Select(month);
		selMonth.selectByIndex(2);
		
		WebElement year=driver.findElement(By.id("year"));
		Select selYear=new Select(year);
		selYear.selectByVisibleText("1992");
		
		driver.findElement(By.id("sex")).click();
		System.out.println(driver.getTitle());
		
		}

	
	}


