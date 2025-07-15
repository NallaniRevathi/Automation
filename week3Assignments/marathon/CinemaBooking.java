package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class CinemaBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//span[@class='sc-cMqPwU hDkxdu pointer']")).click();
		//driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[2]")).click();
		driver.findElement(By.xpath("(//li[@class=\"p-dropdown-item\"])[3]")).click();
		
		//select date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//select movie
		driver.findElement(By.xpath("(//span[text()='OHO ENTHAN BABY'])[2]")).click();
		//select time
		driver.findElement(By.xpath("//span[text()='07:35 PM']")).click();
		//book
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		//accept
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//select seat
		driver.findElement(By.xpath("(//span[text()='13'])[9]")).click();
		
		driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-times']/parent::span"));
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
	}

}
