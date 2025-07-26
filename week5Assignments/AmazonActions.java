package week5Assignments;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("oneplus 9 pro mobile", Keys.ENTER);

		String firstProdPrice = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText();
		Thread.sleep(2000);
		System.out.println("First Product Price : " + firstProdPrice);

		String firstProdRating = driver.findElement(By.xpath("(//div[@data-cy=\"reviews-block\"])[1]")).getText();
		Thread.sleep(2000);
		System.out.println("First Product Rating : " + firstProdRating);

		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		Thread.sleep(5000);
		String subTotal = driver.findElement(By.xpath("(//span[@class=\"a-offscreen\"])[2]")).getText();
		Thread.sleep(5000);
		System.out.println("Subtotal is :" + subTotal);

		if (firstProdPrice.equals(subTotal)) {
			System.out.println("Subtotal is correct");
		} else {
			System.out.println("Subtotal is In-correct");
		}

		driver.close();

	}

}